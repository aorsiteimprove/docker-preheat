for (aSlave in hudson.model.Hudson.instance.slaves) { 
    println('===================='); 
    println('Name: ' + aSlave.name); 
    println('getLabelString: ' + aSlave.getLabelString()); 
    println('getNumExectutors: ' + aSlave.getNumExecutors()); 
    println('getRemoteFS: ' + aSlave.getRemoteFS()); 
    println('getMode: ' + aSlave.getMode()); 
    println('getRootPath: ' + aSlave.getRootPath()); 
    println('getDescriptor: ' + aSlave.getDescriptor()); 
    println('getComputer: ' + aSlave.getComputer()); 
    println('getWorkspaceRoot: ' + aSlave.getWorkspaceRoot()); 
    	
    println('\tcomputer.isAcceptingTasks: ' + aSlave.getComputer().isAcceptingTasks()); 
    println('\tcomputer.isLaunchSupported: ' + aSlave.getComputer().isLaunchSupported()); 
    println('\tcomputer.getConnectTime: ' + aSlave.getComputer().getConnectTime()); 
    println('\tcomputer.isOffline: ' + aSlave.getComputer().isOffline()); 
    println('\tcomputer.countBusy: ' + aSlave.getComputer().countBusy()); 
    println('\tcomputer.getBuilds: ' + aSlave.getComputer().getBuilds()); 
} 