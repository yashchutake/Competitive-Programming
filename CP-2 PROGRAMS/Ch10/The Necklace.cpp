#include <iostream>
#include <vector>
#include <algorithm>
#include <list>
#include <utility>
#include <bitset>
using namespace std;   
int n;
vector<vector<int> > a;
vector<int> deg;
list<pair<int,int>> ans;
void tour(list<pair<int,int>>::iterator it,int u){
    for(int j=1;j<=50;j++){
        if(a[u][j]){
            a[u][j]--;
            a[j][u]--;
            tour(ans.insert(it,{u,j}),j);
        }
    }
}
int main(){
    ios::sync_with_stdio(0);
    int t,c=0;
    cin>>t;
    while(1){
        cin>>n;
        a.assign(50+1,vector<int>(50+1));
        deg.assign(50+1,0);
        ans.clear();
        list<pair<int,int>>::iterator it=ans.end();
        int x,y;
        for(int i=0;i<n;i++){
            cin>>x>>y;
            a[x][y]++;
            a[y][x]++;
            deg[x]++,deg[y]++;
        }
        int flag=0;
        for(int i=1;i<=50;i++)
            if(deg[i]&1){
                flag=1;
                break;
            }
        if(!flag){
            tour(it,x);
            if(ans.size()!=n)
                flag=1;
        }
        if(!flag){
            if(ans.begin()->second!=ans.rbegin()->first)
                flag=1;
        }   
        cout<<"Case #"<<++c<<endl;
        if(flag)
            cout<<"some beads may be lost"<<endl;
        else{
            ans.reverse();
            for(pair<int,int> i:ans)
                cout<<i.first<<' '<<i.second<<endl;
        }
        if(c<t)
            cout<<endl;
        else
            return 0;
    }
}


