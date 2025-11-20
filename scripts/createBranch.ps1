$names = @(
    "dheka",
    "agis",
    "bryan",
    "ghifari"
)

foreach ($name in $names) {
    git checkout -b $name
    Write-Host "Branch $name created"

    git push -u origin $name
    Write-Host "Branch $name pushed"
}

Write-Host "Done"