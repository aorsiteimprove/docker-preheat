for (aSlave in hudson.model.Hudson.instance.slaves) { 
    if (aSlave.name != "packer linux ubuntu16 docker (i-098bcc60657f3aced)") {
        continue
    }

    println('Name: ' + aSlave.name); 
    println('getWorkspaceRoot: ' + aSlave.getWorkspaceRoot());
} 