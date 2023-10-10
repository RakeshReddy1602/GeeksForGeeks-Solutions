

class GfG {
    int findDist(Node root, int a, int b) {
        // Your code here
        List<Integer> nodeOnePath = new ArrayList<>();
        List<Integer> nodeTwoPath = new ArrayList<>();
        getPath(a,nodeOnePath,root);
        getPath(b,nodeTwoPath,root);
        int size = Math.min(nodeOnePath,nodeTwoPath);
        int i =0;
        while(i < min){
            if(nodeOnePath.get(i) == nodeTwoPath.get(i)){
                i++;
            }
            else{
                break;
            }
        }
        return nodeOnePath.size() + nodeTwoPath.size() - (2*i);
    }


    booleanb getPath(int node,List<Integer> path,Node root){
        if(root == null){
            return false;
        }
        if(root.data == node){
            return true;
        }
        path.add(root.data);
        if(getPath(node, path, root.left) || getPath(node, path, root.right)){
            return true;
        }
        path.remove(path.size()-1);
        return false;

    }
}