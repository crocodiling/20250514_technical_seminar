cd ~/desktop #デスクトップに移動
mkdir sample_java #デスクトップにsample_javaディレクトリを作成
cd sample_java #sample_javaに移動
touch sample.java #sample.javaを作成
echo 'public class sample{
    public static void main(String[] args){
        System.out.println("正しくJavaが実行できています");
    }
}' >> sample.java #ファイルに書き込み

/opt/homebrew/cellar/openjdk/23.0.2/bin/javac ~/desktop/sample_java/sample.java
/opt/homebrew/cellar/openjdk/23.0.2/bin/java -cp ~/Desktop/sample_java sample 

#intel macの場合は，パスの指定が異なります．
# テストコメント