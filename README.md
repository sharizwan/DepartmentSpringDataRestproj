# 1. Stage everything in your project
git add .

# 2. Create the first commit on the current branch (which you renamed to main)
git commit -m "Initial commit – Spring Data REST POC"

# 3. Push that commit up to GitHub
git push -u origin main

curl --location 'http://localhost:8080/departments/1'
curl --location --request DELETE 'http://localhost:8080/departments/5' \
--header 'Content-Type: application/json' \
--data '{
    "name":"SOFTWARE"
    
}'
