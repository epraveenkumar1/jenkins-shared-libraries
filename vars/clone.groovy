def call(String url, String bracnch){
  echo "Cloning the code..."
  git url: "${url}", branch: "${branch}"
  echo "Successfully cloned"
}
