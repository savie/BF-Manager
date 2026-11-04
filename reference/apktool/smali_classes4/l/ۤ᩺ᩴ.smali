.class public final Ll/ۤ᩺ᩴ;
.super Ll/ۖۙܺ;
.source "LAQJ"


# instance fields
.field public final synthetic ֫:I

.field public ۚ:Ll/᩷ۨᩴ;

.field public final synthetic ۧ:Ll/ۛ᩺ᩴ;

.field public ۫:Ll/ۤ۠ᩴ;

.field public ܳ:Ll/֫۠ۧ;


# direct methods
.method public constructor <init>(Ll/ۛ᩺ᩴ;I)V
    .locals 0

    .line 890
    iput-object p1, p0, Ll/ۤ᩺ᩴ;->ۧ:Ll/ۛ᩺ᩴ;

    iput p2, p0, Ll/ۤ᩺ᩴ;->֫:I

    invoke-direct {p0}, Ll/ۖۙܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 3

    .line 971
    iget-object v0, p0, Ll/ۤ᩺ᩴ;->۫:Ll/ۤ۠ᩴ;

    invoke-virtual {v0}, Ll/ۤ۠ᩴ;->۫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 972
    iget-object v0, p0, Ll/ۤ᩺ᩴ;->ۧ:Ll/ۛ᩺ᩴ;

    invoke-static {v0}, Ll/ۛ᩺ᩴ;->ۙ(Ll/ۛ᩺ᩴ;)Ll/ܽ֡֫;

    move-result-object v1

    invoke-virtual {v0}, Ll/ۛ᩺ᩴ;->getFileName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Ll/ۛ᩺ᩴ;->ᩴ(Ll/ۛ᩺ᩴ;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Ll/۟᩺ᩴ;->ۙ(Ll/ܽ֡֫;Ljava/lang/String;Ljava/lang/String;)V

    .line 973
    invoke-static {}, Ll/۟᩺ᩴ;->ۙ()Ll/ܽ᩻ۙ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final ۙ(Ljava/lang/Exception;)V
    .locals 4

    .line 980
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/ۤ᩺ᩴ;->۫:Ll/ۤ۠ᩴ;

    invoke-virtual {v0}, Ll/ۤ۠ᩴ;->۫()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 984
    :cond_0
    instance-of v0, p1, Ll/᩷ۘᩴ;

    iget-object v1, p0, Ll/ۤ᩺ᩴ;->ۧ:Ll/ۛ᩺ᩴ;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Ll/᩷ۘᩴ;

    .line 985
    invoke-virtual {v0}, Ll/᩷ۘᩴ;->᩷()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 986
    new-instance p1, Landroid/content/Intent;

    const-string v0, "bin.mt.plus.ACTION_INSTALL_FAILED_DOWNGRADE"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "pkgName"

    .line 987
    invoke-static {v1}, Ll/ۛ᩺ᩴ;->ᩴ(Ll/ۛ᩺ᩴ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 988
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Ll/ۜܺۙ;->ۙ(Landroid/content/ContextWrapper;)Ll/ۜܺۙ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۜܺۙ;->ۙ(Landroid/content/Intent;)Z

    return-void

    .line 991
    :cond_1
    invoke-virtual {v0}, Ll/᩷ۘᩴ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 992
    invoke-static {v1}, Ll/ۛ᩺ᩴ;->ۙ(Ll/ۛ᩺ᩴ;)Ll/ܽ֡֫;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ll/᩷ۘᩴ;->ۙ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    new-instance v2, Ll/۠ܿ֫;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v1, v0, v3}, Ll/۠ܿ֫;-><init>(Ll/ܽ֡֫;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {p1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 996
    :cond_2
    invoke-virtual {v1, p1}, Ll/ۛ᩺ᩴ;->ۙ(Ljava/lang/Exception;)V

    return-void

    :cond_3
    :goto_0
    const p1, 0x7f12008d

    .line 981
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void
.end method

.method public final ᩴ()V
    .locals 9

    const-string v1, "pm install "

    const-string v2, "cat "

    const-string v3, "pm install "

    const-string v4, "-r -t -d "

    .line 907
    invoke-static {}, Ll/۟᩺ᩴ;->᩷()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 909
    :try_start_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Ll/ۤ᩺ᩴ;->ۧ:Ll/ۛ᩺ᩴ;

    invoke-static {v4}, Ll/ۛ᩺ᩴ;->ۤ(Ll/ۛ᩺ᩴ;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ܽۛᩴ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 911
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v6, 0x17

    const/4 v7, 0x0

    if-gt v5, v6, :cond_0

    .line 914
    :try_start_1
    sget-object v5, Ll/ۛۨᩴ;->۫:Ll/᩷ۨᩴ;

    invoke-virtual {v5}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    const/4 v5, 0x0

    .line 918
    :goto_0
    :try_start_2
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_0
    const-string v5, "current"

    .line 922
    :goto_1
    new-instance v6, Ll/֫۠ۧ;

    .line 18
    invoke-static {v7}, Ll/ᩳۧܺ;->ۙ(Z)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_1

    const-string v8, "su"

    .line 922
    :cond_1
    invoke-direct {v6, v8, v7}, Ll/֫۠ۧ;-><init>(Ljava/lang/String;Z)V

    iput-object v6, p0, Ll/ۤ᩺ᩴ;->ܳ:Ll/֫۠ۧ;

    const-string v6, "current"

    .line 923
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object v6, p0, Ll/ۤ᩺ᩴ;->ۧ:Ll/ۛ᩺ᩴ;

    invoke-static {v6}, Ll/ۛ᩺ᩴ;->ۤ(Ll/ۛ᩺ᩴ;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_2

    .line 924
    iget-object v5, p0, Ll/ۤ᩺ᩴ;->ܳ:Ll/֫۠ۧ;

    invoke-static {v5}, Ll/ܽۛᩴ;->ۙ(Ll/᩻۠ۧ;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 926
    :cond_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "--user "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 927
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x22

    if-lt v6, v8, :cond_3

    .line 928
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "--bypass-low-target-sdk-block "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 930
    :cond_3
    iget-object v6, p0, Ll/ۤ᩺ᩴ;->ܳ:Ll/֫۠ۧ;

    iget-object v8, p0, Ll/ۤ᩺ᩴ;->ۧ:Ll/ۛ᩺ᩴ;

    invoke-static {v8}, Ll/ۛ᩺ᩴ;->ۤ(Ll/ۛ᩺ᩴ;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v6, v5, v8}, Ll/ܽۛᩴ;->ۙ(Ll/᩻۠ۧ;Ljava/lang/String;Ljava/lang/String;)V

    .line 931
    iget v5, p0, Ll/ۤ᩺ᩴ;->֫:I

    const/4 v6, 0x1

    if-eqz v5, :cond_7

    if-eq v5, v6, :cond_6

    const/4 v1, 0x2

    if-ne v5, v1, :cond_5

    const-string v1, "/data/local/tmp/mt_install.apk"

    new-array v2, v7, [Ljava/lang/String;

    .line 939
    invoke-static {v1, v2}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v1

    iput-object v1, p0, Ll/ۤ᩺ᩴ;->ۚ:Ll/᩷ۨᩴ;

    .line 940
    iget-object v1, p0, Ll/ۤ᩺ᩴ;->۫:Ll/ۤ۠ᩴ;

    const/4 v2, 0x0

    .line 66
    invoke-virtual {v1, v2}, Ll/ۤ۠ᩴ;->ۙ(Ljava/lang/Runnable;)Ll/ۤ۠ᩴ;

    .line 941
    iget-object v1, p0, Ll/ۤ᩺ᩴ;->ۧ:Ll/ۛ᩺ᩴ;

    invoke-static {v1}, Ll/ۛ᩺ᩴ;->᩷(Ll/ۛ᩺ᩴ;)Ll/᩷ۨᩴ;

    move-result-object v1

    iget-object v5, p0, Ll/ۤ᩺ᩴ;->ۚ:Ll/᩷ۨᩴ;

    new-instance v7, Ll/᩷᩺ᩴ;

    invoke-direct {v7, p0}, Ll/᩷᩺ᩴ;-><init>(Ll/ۤ᩺ᩴ;)V

    .line 523
    invoke-virtual {v1, v5, v2, v7}, Ll/᩷ۨᩴ;->ۙ(Ll/᩷ۨᩴ;Ll/᩺᩵ᩴ;Ll/᩹ܿᩴ;)V

    .line 952
    iget-object v1, p0, Ll/ۤ᩺ᩴ;->۫:Ll/ۤ۠ᩴ;

    invoke-virtual {v1}, Ll/ۤ۠ᩴ;->۫()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 953
    monitor-exit v0

    goto/16 :goto_3

    .line 955
    :cond_4
    iget-object v1, p0, Ll/ۤ᩺ᩴ;->۫:Ll/ۤ۠ᩴ;

    invoke-virtual {v1}, Ll/ۤ۠ᩴ;->ۤ()V

    .line 956
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/data/local/tmp/mt_install.apk"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    .line 959
    :cond_5
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    .line 936
    :cond_6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۤ᩺ᩴ;->ۧ:Ll/ۛ᩺ᩴ;

    invoke-static {v2}, Ll/ۛ᩺ᩴ;->᩷(Ll/ۛ᩺ᩴ;)Ll/᩷ۨᩴ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/۟۠ۧ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " | pm install "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "-S "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۤ᩺ᩴ;->ۧ:Ll/ۛ᩺ᩴ;

    invoke-static {v2}, Ll/ۛ᩺ᩴ;->᩷(Ll/ۛ᩺ᩴ;)Ll/᩷ۨᩴ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩷ۨᩴ;->۠ۙ()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    .line 933
    :cond_7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۤ᩺ᩴ;->ۧ:Ll/ۛ᩺ᩴ;

    invoke-static {v1}, Ll/ۛ᩺ᩴ;->᩷(Ll/ۛ᩺ᩴ;)Ll/᩷ۨᩴ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/۟۠ۧ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 961
    :goto_2
    iget-object v2, p0, Ll/ۤ᩺ᩴ;->۫:Ll/ۤ۠ᩴ;

    invoke-virtual {v2, v6}, Ll/ۤ۠ᩴ;->ۙ(Z)V

    .line 963
    iget-object v2, p0, Ll/ۤ᩺ᩴ;->ܳ:Ll/֫۠ۧ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v3, 0x0

    .line 15
    invoke-virtual {v2, v3, v4, v1}, Ll/֫۠ۧ;->ۙ(JLjava/lang/String;)Ll/ۧ۠ۧ;

    move-result-object v1

    .line 963
    invoke-virtual {v1}, Ll/ۧ۠ۧ;->ۙ()Ljava/lang/String;

    move-result-object v1

    .line 965
    invoke-static {v1}, Ll/۟᩺ᩴ;->ۙ(Ljava/lang/String;)V

    .line 966
    monitor-exit v0

    :goto_3
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final ᩷()V
    .locals 3

    .line 897
    new-instance v0, Ll/ۤ۠ᩴ;

    iget-object v1, p0, Ll/ۤ᩺ᩴ;->ۧ:Ll/ۛ᩺ᩴ;

    invoke-static {v1}, Ll/ۛ᩺ᩴ;->ۙ(Ll/ۛ᩺ᩴ;)Ll/ܽ֡֫;

    move-result-object v2

    invoke-direct {v0, v2}, Ll/ۤ۠ᩴ;-><init>(Ll/ܽ֡֫;)V

    const v2, 0x7f1204ed

    .line 898
    invoke-virtual {v0, v2}, Ll/ۤ۠ᩴ;->ۤ(I)V

    .line 899
    invoke-virtual {v1}, Ll/ۛ᩺ᩴ;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۤ۠ᩴ;->ۙ(Ljava/lang/CharSequence;)V

    new-instance v1, Ll/ۙ᩺ᩴ;

    invoke-direct {v1, p0}, Ll/ۙ᩺ᩴ;-><init>(Ll/ۤ᩺ᩴ;)V

    .line 900
    invoke-virtual {v0, v1}, Ll/ۤ۠ᩴ;->ۙ(Landroid/view/View$OnClickListener;)Ll/ۤ۠ᩴ;

    .line 901
    invoke-virtual {v0}, Ll/ۤ۠ᩴ;->᩻()Ll/ۤ۠ᩴ;

    iput-object v0, p0, Ll/ۤ᩺ᩴ;->۫:Ll/ۤ۠ᩴ;

    return-void
.end method

.method public final ᩸()V
    .locals 1

    .line 1001
    iget-object v0, p0, Ll/ۤ᩺ᩴ;->۫:Ll/ۤ۠ᩴ;

    invoke-virtual {v0}, Ll/ۤ۠ᩴ;->᩸()V

    .line 1002
    iget-object v0, p0, Ll/ۤ᩺ᩴ;->ܳ:Ll/֫۠ۧ;

    if-eqz v0, :cond_0

    .line 1003
    invoke-virtual {v0}, Ll/֫۠ۧ;->close()V

    .line 1005
    :cond_0
    iget-object v0, p0, Ll/ۤ᩺ᩴ;->ۚ:Ll/᩷ۨᩴ;

    if-eqz v0, :cond_1

    .line 1006
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ᩳ()Z

    :cond_1
    return-void
.end method
