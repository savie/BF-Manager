.class public final Ll/᩻᩷ۚ;
.super Ljava/lang/Object;
.source "I6DO"


# static fields
.field public static ۙ:Ll/֫᩷ۚ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۙ(Ljava/lang/String;)Ll/᩸۫ۚ;
    .locals 2

    .line 311
    new-instance v0, Ll/᩸۫ۚ;

    const-string v1, "failed"

    invoke-direct {v0, v1, p0}, Ll/᩸۫ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static ۙ(Ll/֫᩷ۚ;Landroid/content/Intent;)Ll/᩸۫ۚ;
    .locals 3

    .line 259
    iput-object p1, p0, Ll/֫᩷ۚ;->ۤ:Landroid/content/Intent;

    .line 260
    new-instance p1, Ll/ۚ᩷ۚ;

    invoke-direct {p1, p0}, Ll/ۚ᩷ۚ;-><init>(Ll/֫᩷ۚ;)V

    invoke-static {p1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    .line 274
    :try_start_0
    iget-object p1, p0, Ll/֫᩷ۚ;->᩸:Ljava/util/concurrent/CountDownLatch;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2

    invoke-virtual {p1, v1, v2, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 276
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 278
    :goto_0
    const-class p1, Ll/᩻᩷ۚ;

    move-object v0, p1

    monitor-enter v0

    const/4 p1, 0x1

    .line 279
    :try_start_1
    iput-boolean p1, p0, Ll/֫᩷ۚ;->ۙ:Z

    .line 280
    iget-object p0, p0, Ll/֫᩷ۚ;->ܳ:Ll/᩸۫ۚ;

    if-nez p0, :cond_0

    const-string p0, "Cannot open the installation screen. Open MT and retry."

    invoke-static {p0}, Ll/᩻᩷ۚ;->ۙ(Ljava/lang/String;)Ll/᩸۫ۚ;

    move-result-object p0

    :cond_0
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 281
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ۙ(Ll/֫᩷ۚ;Ll/᩷ۨᩴ;)Ll/᩸۫ۚ;
    .locals 6

    .line 111
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object v0

    .line 112
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-lt v1, v2, :cond_0

    invoke-static {}, Ll/᩶᩷ۧ;->ܶ()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/pm/PackageManager;->canRequestPackageInstalls()Z

    move-result v2

    goto :goto_0

    .line 113
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const-string v5, "install_non_market_apps"

    invoke-static {v2, v5, v3}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_2

    .line 116
    new-instance p0, Ll/۫᩷ۚ;

    invoke-direct {p0, v3, v0}, Ll/۫᩷ۚ;-><init>(ILjava/lang/Object;)V

    invoke-static {p0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    const-string p0, "Allow MT to install unknown apps in the phone settings, then retry."

    .line 124
    invoke-static {p0}, Ll/᩻᩷ۚ;->ۙ(Ljava/lang/String;)Ll/᩸۫ۚ;

    move-result-object p0

    return-object p0

    :cond_2
    const/16 v0, 0x18

    if-ge v1, v0, :cond_3

    .line 126
    sget-object v0, Ll/ܽۨᩴ;->ܰ:Ljava/lang/String;

    .line 88
    sget-object v0, Ll/᩶᩷ۧ;->ܳ:Landroid/content/SharedPreferences;

    const-string v1, "apk_installation_prevents_deletion"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 126
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ۨ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 127
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ۘ᩷()Landroid/net/Uri;

    move-result-object p1

    goto :goto_1

    :cond_3
    invoke-static {p1}, Ll/ܽۨᩴ;->ۙ(Ll/᩷ۨᩴ;)Landroid/net/Uri;

    move-result-object p1

    .line 128
    :goto_1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "application/vnd.android.package-archive"

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    .line 129
    invoke-virtual {p1, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "_install_apk_from_mt_as5d42"

    .line 131
    invoke-virtual {p1, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 132
    invoke-static {}, Ll/᩶᩷ۧ;->ܶ()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-static {v0}, Ll/֫ᩴۧ;->ۙ(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 133
    invoke-static {p0, p1}, Ll/᩻᩷ۚ;->ۙ(Ll/֫᩷ۚ;Landroid/content/Intent;)Ll/᩸۫ۚ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/֫᩷ۚ;Ll/᩷ۨᩴ;Ljava/lang/String;)Ll/᩸۫ۚ;
    .locals 9

    const-string v0, "Cannot start root installation: "

    const-string v1, "pm install "

    const-string v2, "cat "

    const-string v3, "-r -t -d "

    .line 137
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->᩻()Z

    move-result v4

    if-nez v4, :cond_0

    const-string p0, "The root installer cannot read this file path. Save the APK to shared storage and retry."

    .line 138
    invoke-static {p0}, Ll/᩻᩷ۚ;->ۙ(Ljava/lang/String;)Ll/᩸۫ۚ;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 143
    :try_start_0
    new-instance v6, Ll/֫۠ۧ;

    .line 18
    invoke-static {v4}, Ll/ᩳۧܺ;->ۙ(Z)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_1

    const-string v7, "su"

    .line 143
    :cond_1
    invoke-direct {v6, v7, v4}, Ll/֫۠ۧ;-><init>(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 144
    :try_start_1
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v7, 0x17

    const-string v8, "current"

    if-gt v5, v7, :cond_2

    :try_start_2
    invoke-static {}, Landroid/os/Process;->myUserHandle()Landroid/os/UserHandle;

    move-result-object v7

    invoke-virtual {v7}, Landroid/os/UserHandle;->hashCode()I

    move-result v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    :cond_2
    move-object v7, v8

    .line 145
    :goto_0
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_3

    invoke-static {v6}, Ll/ܽۛᩴ;->ۙ(Ll/᩻۠ۧ;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    .line 146
    :cond_3
    invoke-static {v6, v7, p2}, Ll/ܽۛᩴ;->ۙ(Ll/᩻۠ۧ;Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Ll/ܽۛᩴ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "--user "

    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " "

    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/16 v3, 0x22

    if-lt v5, v3, :cond_4

    .line 148
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "--bypass-low-target-sdk-block "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 149
    :cond_4
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/۟۠ۧ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/16 v7, 0x1c

    if-lt v5, v7, :cond_5

    const-string v5, "/data/local/tmp"

    .line 151
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->getParent()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    .line 152
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " | pm install "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "-S "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/᩷ۨᩴ;->۠ۙ()J

    move-result-wide p1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 153
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 154
    :goto_1
    iget-object p0, p0, Ll/֫᩷ۚ;->ᩴ:Ll/ᩴ۫ۚ;

    invoke-virtual {p0}, Ll/ᩴ۫ۚ;->ۙ()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-wide/32 v1, 0xea60

    const/4 p0, 0x1

    .line 156
    :try_start_3
    invoke-virtual {v6, v1, v2, p1}, Ll/֫۠ۧ;->ۙ(JLjava/lang/String;)Ll/ۧ۠ۧ;

    move-result-object p1

    invoke-static {p1}, Ll/᩻᩷ۚ;->ۙ(Ll/ۧ۠ۧ;)Ll/᩸۫ۚ;

    move-result-object p0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 160
    invoke-virtual {v6}, Ll/֫۠ۧ;->close()V

    return-object p0

    :catch_0
    move-exception p1

    move-object p0, p1

    const/4 v4, 0x1

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_7

    :catch_1
    move-exception p0

    :goto_2
    move-object v5, v6

    goto :goto_3

    :catchall_1
    move-exception p0

    goto :goto_6

    :catch_2
    move-exception p0

    :goto_3
    if-eqz v4, :cond_6

    .line 315
    :try_start_4
    new-instance p0, Ll/᩸۫ۚ;

    const-string p1, "started"

    const-string p2, "Installation was submitted but its result is unavailable. Check the phone before retrying."

    invoke-direct {p0, p1, p2}, Ll/᩸۫ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    .line 158
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 319
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_7

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    goto :goto_4

    :cond_7
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    .line 158
    :goto_4
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩻᩷ۚ;->ۙ(Ljava/lang/String;)Ll/᩸۫ۚ;

    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_5
    if-eqz v5, :cond_8

    .line 160
    invoke-virtual {v5}, Ll/֫۠ۧ;->close()V

    :cond_8
    return-object p0

    :goto_6
    move-object v6, v5

    :goto_7
    if-eqz v6, :cond_9

    invoke-virtual {v6}, Ll/֫۠ۧ;->close()V

    .line 161
    :cond_9
    throw p0
.end method

.method public static ۙ(Ll/֫᩷ۚ;Ll/᩷ۨᩴ;Ljava/lang/String;Z)Ll/᩸۫ۚ;
    .locals 16

    move-object/from16 v0, p2

    const-string v1, "Installation was submitted but its result is unavailable. Check the phone before retrying."

    const-string v2, "started"

    const-string v3, "Cannot abandon MCP installation session"

    const-string v4, "Cannot close MCP installation session"

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 169
    :try_start_0
    invoke-static {}, Ll/ܺۘᩴ;->ۙ()Landroid/content/pm/PackageInstaller$SessionParams;

    move-result-object v7

    const/4 v8, 0x1

    if-eqz p3, :cond_0

    .line 174
    invoke-static {}, Ll/ܺۘᩴ;->᩷()Landroid/content/pm/IPackageInstaller;

    move-result-object v0

    .line 175
    invoke-static {}, Lcom/rosan/dhizuku/api/Dhizuku;->getOwnerPackageName()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    goto :goto_3

    .line 178
    :cond_0
    invoke-static {}, Ll/ܺۘᩴ;->ۤ()Landroid/content/pm/IPackageInstaller;

    move-result-object v9

    .line 179
    invoke-static {}, Ll/۫ۖۘ;->᩸()I

    move-result v10

    if-nez v10, :cond_1

    const/4 v10, 0x1

    goto :goto_0

    :cond_1
    const/4 v10, 0x0

    :goto_0
    if-eqz v10, :cond_2

    .line 180
    invoke-static {}, Landroid/os/Process;->myUserHandle()Landroid/os/UserHandle;

    move-result-object v11

    invoke-virtual {v11}, Landroid/os/UserHandle;->hashCode()I

    move-result v11

    goto :goto_1

    :cond_2
    const/4 v11, 0x0

    .line 181
    :goto_1
    invoke-static {v11, v0}, Ll/ܺۘᩴ;->ۙ(ILjava/lang/String;)V

    if-eqz v10, :cond_3

    .line 183
    invoke-static {}, Ll/᩶᩷ۧ;->᩹()Ljava/lang/String;

    move-result-object v10

    goto :goto_2

    :cond_3
    const-string v10, "com.android.shell"

    .line 182
    :goto_2
    invoke-static {v7, v10, v0}, Ll/ܺۘᩴ;->ۙ(Landroid/content/pm/PackageInstaller$SessionParams;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move v10, v11

    move-object v15, v9

    move-object v9, v0

    move-object v0, v15

    :goto_3
    if-nez p3, :cond_4

    .line 185
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v12, 0x1f

    if-lt v11, v12, :cond_4

    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object v11

    invoke-virtual {v11}, Landroid/app/Application;->getAttributionTag()Ljava/lang/String;

    move-result-object v11

    goto :goto_4

    :cond_4
    move-object v11, v5

    .line 186
    :goto_4
    invoke-static {v0, v9, v11, v10}, Ll/ܺۘᩴ;->ۙ(Landroid/content/pm/IPackageInstaller;Ljava/lang/String;Ljava/lang/String;I)Landroid/content/pm/PackageInstaller;

    move-result-object v9

    .line 187
    invoke-virtual {v9, v7}, Landroid/content/pm/PackageInstaller;->createSession(Landroid/content/pm/PackageInstaller$SessionParams;)I

    move-result v7

    .line 188
    invoke-interface {v0, v7}, Landroid/content/pm/IPackageInstaller;->openSession(I)Landroid/content/pm/IPackageInstallerSession;

    move-result-object v0

    if-eqz p3, :cond_5

    .line 190
    invoke-interface {v0}, Landroid/content/pm/IPackageInstallerSession;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/rosan/dhizuku/api/Dhizuku;->binderWrapper(Landroid/os/IBinder;)Landroid/os/IBinder;

    move-result-object v0

    goto :goto_5

    :cond_5
    new-instance v7, Ll/ۚۖۘ;

    invoke-interface {v0}, Landroid/content/pm/IPackageInstallerSession;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {v7, v0}, Ll/ۚۖۘ;-><init>(Landroid/os/IBinder;)V

    move-object v0, v7

    .line 189
    :goto_5
    invoke-static {v0}, Landroid/content/pm/IPackageInstallerSession$Stub;->asInterface(Landroid/os/IBinder;)Landroid/content/pm/IPackageInstallerSession;

    move-result-object v0

    .line 191
    invoke-static {v0}, Ll/ܺۘᩴ;->ۙ(Landroid/content/pm/IPackageInstallerSession;)Landroid/content/pm/PackageInstaller$Session;

    move-result-object v5

    .line 192
    invoke-virtual/range {p1 .. p1}, Ll/᩷ۨᩴ;->ۧ᩷()Ljava/io/InputStream;

    move-result-object v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    :try_start_1
    invoke-virtual/range {p1 .. p1}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v10

    const-wide/16 v11, 0x0

    const-wide/16 v13, -0x1

    move-object v9, v5

    invoke-virtual/range {v9 .. v14}, Landroid/content/pm/PackageInstaller$Session;->openWrite(Ljava/lang/String;JJ)Ljava/io/OutputStream;

    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    const/high16 v0, 0x10000

    :try_start_2
    new-array v0, v0, [B

    .line 195
    :goto_6
    invoke-virtual {v7, v0}, Ljava/io/InputStream;->read([B)I

    move-result v10

    const/4 v11, -0x1

    if-eq v10, v11, :cond_7

    .line 196
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v11

    if-nez v11, :cond_6

    .line 197
    invoke-virtual {v9, v0, v6, v10}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_6

    .line 196
    :cond_6
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_7
    if-eqz v9, :cond_8

    .line 199
    :try_start_3
    invoke-virtual {v9}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :cond_8
    :try_start_4
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V

    .line 200
    new-instance v0, Ll/ۧ᩷ۚ;

    invoke-direct {v0, v6}, Ll/ۧ᩷ۚ;-><init>(I)V

    .line 78
    const-class v7, Landroid/content/IntentSender;

    new-array v9, v8, [Ljava/lang/Class;

    const-class v10, Landroid/content/IIntentSender;

    aput-object v10, v9, v6

    invoke-virtual {v7, v9}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v7

    new-array v9, v8, [Ljava/lang/Object;

    aput-object v0, v9, v6

    invoke-virtual {v7, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/IntentSender;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_6
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 203
    :try_start_5
    invoke-virtual {v5, v7}, Landroid/content/pm/PackageInstaller$Session;->commit(Landroid/content/IntentSender;)V

    .line 204
    iget-object v6, v0, Ll/ۧ᩷ۚ;->ۙ:Ljava/util/concurrent/CountDownLatch;

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/32 v9, 0xea60

    invoke-virtual {v6, v9, v10, v7}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v6

    if-nez v6, :cond_9

    .line 315
    new-instance v0, Ll/᩸۫ۚ;

    invoke-direct {v0, v2, v1}, Ll/᩸۫ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_7
    move-object v1, v0

    goto :goto_8

    .line 205
    :cond_9
    iget-object v0, v0, Ll/ۧ᩷ۚ;->᩷:Landroid/content/Intent;

    const-string v6, "android.content.pm.extra.STATUS"

    .line 206
    invoke-virtual {v0, v6, v8}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6

    if-nez v6, :cond_a

    .line 307
    new-instance v0, Ll/᩸۫ۚ;

    const-string v6, "installed"

    const-string v7, "Installation completed."

    invoke-direct {v0, v6, v7}, Ll/᩸۫ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_7

    .line 227
    :goto_8
    :try_start_6
    invoke-virtual {v5}, Landroid/content/pm/PackageInstaller$Session;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    goto :goto_b

    :cond_a
    if-ne v6, v11, :cond_d

    :try_start_7
    const-string v6, "android.intent.extra.INTENT"

    .line 209
    invoke-virtual {v0, v6}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-nez v0, :cond_b

    .line 237
    :try_start_8
    invoke-virtual {v5}, Landroid/content/pm/PackageInstaller$Session;->abandon()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_9

    :catch_1
    move-exception v0

    move-object v6, v0

    .line 239
    :try_start_9
    invoke-static {v3, v6}, Ll/᩵ܶۤ;->᩷(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_9
    const-string v0, "The installer did not provide a confirmation screen."

    .line 212
    invoke-static {v0}, Ll/᩻᩷ۚ;->ۙ(Ljava/lang/String;)Ll/᩸۫ۚ;

    move-result-object v1
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 227
    :try_start_a
    invoke-virtual {v5}, Landroid/content/pm/PackageInstaller$Session;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4

    return-object v1

    :cond_b
    move-object/from16 v6, p0

    .line 214
    :try_start_b
    invoke-static {v6, v0}, Ll/᩻᩷ۚ;->ۙ(Ll/֫᩷ۚ;Landroid/content/Intent;)Ll/᩸۫ۚ;

    move-result-object v6

    .line 215
    invoke-virtual {v6}, Ll/᩸۫ۚ;->᩷()Ljava/lang/String;

    move-result-object v0

    const-string v7, "failed"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_5
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    if-eqz v0, :cond_c

    .line 237
    :try_start_c
    invoke-virtual {v5}, Landroid/content/pm/PackageInstaller$Session;->abandon()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_2
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    goto :goto_a

    :catch_2
    move-exception v0

    move-object v7, v0

    .line 239
    :try_start_d
    invoke-static {v3, v7}, Ll/᩵ܶۤ;->᩷(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_5
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 227
    :cond_c
    :goto_a
    :try_start_e
    invoke-virtual {v5}, Landroid/content/pm/PackageInstaller$Session;->close()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_3

    return-object v6

    :catch_3
    move-exception v0

    move-object v1, v6

    .line 229
    :goto_b
    invoke-static {v4, v0}, Ll/᩵ܶۤ;->᩷(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1

    :cond_d
    :try_start_f
    const-string v7, "android.content.pm.extra.STATUS_MESSAGE"

    .line 218
    invoke-virtual {v0, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 219
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_e

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Installation failed (status "

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ")."

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_e
    invoke-static {v0}, Ll/᩻᩷ۚ;->ۙ(Ljava/lang/String;)Ll/᩸۫ۚ;

    move-result-object v1
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_5
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 227
    :try_start_10
    invoke-virtual {v5}, Landroid/content/pm/PackageInstaller$Session;->close()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_4

    return-object v1

    :catch_4
    move-exception v0

    .line 229
    invoke-static {v4, v0}, Ll/᩵ܶۤ;->᩷(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1

    :catchall_0
    move-exception v0

    const/4 v6, 0x1

    goto/16 :goto_15

    :catch_5
    move-exception v0

    const/4 v6, 0x1

    goto :goto_e

    :catchall_1
    move-exception v0

    move-object v8, v0

    if-eqz v9, :cond_f

    .line 192
    :try_start_11
    invoke-virtual {v9}, Ljava/io/OutputStream;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    goto :goto_c

    :catchall_2
    move-exception v0

    move-object v9, v0

    :try_start_12
    invoke-virtual {v8, v9}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_f
    :goto_c
    throw v8
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    :catchall_3
    move-exception v0

    move-object v8, v0

    if-eqz v7, :cond_10

    :try_start_13
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    goto :goto_d

    :catchall_4
    move-exception v0

    move-object v7, v0

    :try_start_14
    invoke-virtual {v8, v7}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_10
    :goto_d
    throw v8
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_6
    .catchall {:try_start_14 .. :try_end_14} :catchall_5

    :catchall_5
    move-exception v0

    goto :goto_15

    :catch_6
    move-exception v0

    .line 221
    :goto_e
    :try_start_15
    instance-of v7, v0, Ljava/lang/InterruptedException;

    if-eqz v7, :cond_11

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Thread;->interrupt()V

    :cond_11
    if-eqz v6, :cond_12

    .line 315
    new-instance v0, Ll/᩸۫ۚ;

    invoke-direct {v0, v2, v1}, Ll/᩸۫ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_f
    move-object v1, v0

    goto :goto_12

    .line 222
    :cond_12
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot start "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_13

    const-string v2, "Dhizuku"

    goto :goto_10

    :cond_13
    const-string v2, "Shizuku"

    :goto_10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " installation: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_14

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    goto :goto_11

    :cond_14
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 222
    :goto_11
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩻᩷ۚ;->ۙ(Ljava/lang/String;)Ll/᩸۫ۚ;

    move-result-object v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_5

    goto :goto_f

    :goto_12
    if-eqz v5, :cond_16

    if-nez v6, :cond_15

    .line 237
    :try_start_16
    invoke-virtual {v5}, Landroid/content/pm/PackageInstaller$Session;->abandon()V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_7

    goto :goto_13

    :catch_7
    move-exception v0

    move-object v2, v0

    .line 239
    invoke-static {v3, v2}, Ll/᩵ܶۤ;->᩷(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 227
    :cond_15
    :goto_13
    :try_start_17
    invoke-virtual {v5}, Landroid/content/pm/PackageInstaller$Session;->close()V
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_8

    goto :goto_14

    :catch_8
    move-exception v0

    move-object v2, v0

    .line 229
    invoke-static {v4, v2}, Ll/᩵ܶۤ;->᩷(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_16
    :goto_14
    return-object v1

    :goto_15
    move-object v1, v0

    if-eqz v5, :cond_18

    if-nez v6, :cond_17

    .line 237
    :try_start_18
    invoke-virtual {v5}, Landroid/content/pm/PackageInstaller$Session;->abandon()V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_9

    goto :goto_16

    :catch_9
    move-exception v0

    move-object v2, v0

    .line 239
    invoke-static {v3, v2}, Ll/᩵ܶۤ;->᩷(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 227
    :cond_17
    :goto_16
    :try_start_19
    invoke-virtual {v5}, Landroid/content/pm/PackageInstaller$Session;->close()V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_a

    goto :goto_17

    :catch_a
    move-exception v0

    move-object v2, v0

    .line 229
    invoke-static {v4, v2}, Ll/᩵ܶۤ;->᩷(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 232
    :cond_18
    :goto_17
    throw v1
.end method

.method public static ۙ(Ll/ۧ۠ۧ;)Ll/᩸۫ۚ;
    .locals 7

    .line 244
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۧ۠ۧ;->᩷:[Ljava/lang/String;

    const-string v2, "\n"

    invoke-static {v2, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ll/ۧ۠ۧ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, v0, v4

    .line 245
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    const-string v6, "Failure ["

    .line 246
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v6, "]"

    invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-static {v5}, Ll/᩻᩷ۚ;->ۙ(Ljava/lang/String;)Ll/᩸۫ۚ;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 248
    :cond_1
    invoke-virtual {p0}, Ll/ۧ۠ۧ;->᩷()Z

    move-result p0

    if-nez p0, :cond_4

    .line 249
    array-length p0, v1

    :goto_1
    if-ge v3, p0, :cond_4

    aget-object v0, v1, v3

    .line 250
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Success"

    .line 251
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "Completed with warning(s)"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 307
    :cond_3
    :goto_2
    new-instance p0, Ll/᩸۫ۚ;

    const-string v0, "installed"

    const-string v1, "Installation completed."

    invoke-direct {p0, v0, v1}, Ll/᩸۫ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    .line 315
    :cond_4
    new-instance p0, Ll/᩸۫ۚ;

    const-string v0, "started"

    const-string v1, "Installation was submitted but its result is unavailable. Check the phone before retrying."

    invoke-direct {p0, v0, v1}, Ll/᩸۫ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public static ۙ(Ll/ᩴ۫ۚ;)Ll/᩸۫ۚ;
    .locals 7

    const-string v1, "Cannot start installation: "

    .line 54
    new-instance v2, Ll/֫᩷ۚ;

    invoke-direct {v2, p0}, Ll/֫᩷ۚ;-><init>(Ll/ᩴ۫ۚ;)V

    .line 55
    const-class v0, Ll/᩻᩷ۚ;

    monitor-enter v0

    .line 56
    :try_start_0
    sget-object v3, Ll/᩻᩷ۚ;->ۙ:Ll/֫᩷ۚ;

    const/4 v4, 0x0

    if-nez v3, :cond_c

    .line 60
    sput-object v2, Ll/᩻᩷ۚ;->ۙ:Ll/֫᩷ۚ;

    .line 61
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 63
    :try_start_1
    invoke-virtual {p0}, Ll/ᩴ۫ۚ;->᩷()Ll/᩷ۨᩴ;

    move-result-object p0

    .line 64
    invoke-static {}, Ll/ܽۛᩴ;->ۙ()Ljava/lang/String;

    move-result-object v0

    .line 65
    invoke-static {}, Ll/᩻᩷ۚ;->᩷()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    invoke-static {v2, p0, v0, v3}, Ll/᩻᩷ۚ;->ۙ(Ll/֫᩷ۚ;Ll/᩷ۨᩴ;Ljava/lang/String;Z)Ll/᩸۫ۚ;

    move-result-object p0
    :try_end_1
    .catch Ll/ۢܳۚ; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 83
    const-class v0, Ll/᩻᩷ۚ;

    monitor-enter v0

    .line 84
    :try_start_2
    sget-object v1, Ll/᩻᩷ۚ;->ۙ:Ll/֫᩷ۚ;

    if-ne v1, v2, :cond_0

    sput-object v4, Ll/᩻᩷ۚ;->ۙ:Ll/֫᩷ۚ;

    .line 85
    :cond_0
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0

    .line 66
    :cond_1
    :try_start_3
    invoke-static {}, Ll/᩻᩷ۚ;->ۙ()Z

    move-result v3

    const/4 v5, 0x1

    if-eqz v3, :cond_5

    .line 67
    invoke-static {v2, p0, v0, v5}, Ll/᩻᩷ۚ;->ۙ(Ll/֫᩷ۚ;Ll/᩷ۨᩴ;Ljava/lang/String;Z)Ll/᩸۫ۚ;

    move-result-object p0

    .line 68
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Ll/᩸۫ۚ;->᩷()Ljava/lang/String;

    move-result-object v0

    const-string v3, "failed"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 69
    new-instance v3, Ll/᩸۫ۚ;

    invoke-virtual {p0}, Ll/᩸۫ۚ;->᩷()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/᩸۫ۚ;->ۙ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " Dhizuku uses its own installer source; the configured installer source is not applied."

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v3, v0, p0}, Ll/᩸۫ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ll/ۢܳۚ; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 83
    const-class p0, Ll/᩻᩷ۚ;

    move-object v0, p0

    monitor-enter v0

    .line 84
    :try_start_4
    sget-object p0, Ll/᩻᩷ۚ;->ۙ:Ll/֫᩷ۚ;

    if-ne p0, v2, :cond_2

    sput-object v4, Ll/᩻᩷ۚ;->ۙ:Ll/֫᩷ۚ;

    .line 85
    :cond_2
    monitor-exit v0

    return-object v3

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p0

    .line 83
    :cond_3
    const-class v0, Ll/᩻᩷ۚ;

    monitor-enter v0

    .line 84
    :try_start_5
    sget-object v1, Ll/᩻᩷ۚ;->ۙ:Ll/֫᩷ۚ;

    if-ne v1, v2, :cond_4

    sput-object v4, Ll/᩻᩷ۚ;->ۙ:Ll/֫᩷ۚ;

    .line 85
    :cond_4
    monitor-exit v0

    return-object p0

    :catchall_2
    move-exception p0

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw p0

    .line 74
    :cond_5
    :try_start_6
    sget-object v3, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    const-string v6, "apk_installation_root"

    invoke-interface {v3, v6, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {}, Ll/۟۠ۧ;->֫()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 75
    invoke-static {v2, p0, v0}, Ll/᩻᩷ۚ;->ۙ(Ll/֫᩷ۚ;Ll/᩷ۨᩴ;Ljava/lang/String;)Ll/᩸۫ۚ;

    move-result-object p0
    :try_end_6
    .catch Ll/ۢܳۚ; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 83
    const-class v0, Ll/᩻᩷ۚ;

    monitor-enter v0

    .line 84
    :try_start_7
    sget-object v1, Ll/᩻᩷ۚ;->ۙ:Ll/֫᩷ۚ;

    if-ne v1, v2, :cond_6

    sput-object v4, Ll/᩻᩷ۚ;->ۙ:Ll/֫᩷ۚ;

    .line 85
    :cond_6
    monitor-exit v0

    return-object p0

    :catchall_3
    move-exception p0

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw p0

    .line 77
    :cond_7
    :try_start_8
    invoke-static {v2, p0}, Ll/᩻᩷ۚ;->ۙ(Ll/֫᩷ۚ;Ll/᩷ۨᩴ;)Ll/᩸۫ۚ;

    move-result-object p0
    :try_end_8
    .catch Ll/ۢܳۚ; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 83
    const-class v0, Ll/᩻᩷ۚ;

    monitor-enter v0

    .line 84
    :try_start_9
    sget-object v1, Ll/᩻᩷ۚ;->ۙ:Ll/֫᩷ۚ;

    if-ne v1, v2, :cond_8

    sput-object v4, Ll/᩻᩷ۚ;->ۙ:Ll/֫᩷ۚ;

    .line 85
    :cond_8
    monitor-exit v0

    return-object p0

    :catchall_4
    move-exception p0

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    throw p0

    :catchall_5
    move-exception p0

    goto :goto_1

    :catch_0
    move-exception p0

    .line 81
    :try_start_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 319
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_9

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_9
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    .line 81
    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩻᩷ۚ;->ۙ(Ljava/lang/String;)Ll/᩸۫ۚ;

    move-result-object p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 83
    const-class v0, Ll/᩻᩷ۚ;

    monitor-enter v0

    .line 84
    :try_start_b
    sget-object v1, Ll/᩻᩷ۚ;->ۙ:Ll/֫᩷ۚ;

    if-ne v1, v2, :cond_a

    sput-object v4, Ll/᩻᩷ۚ;->ۙ:Ll/֫᩷ۚ;

    .line 85
    :cond_a
    monitor-exit v0

    return-object p0

    :catchall_6
    move-exception p0

    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    throw p0

    :catch_1
    move-exception p0

    .line 79
    :try_start_c
    throw p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 83
    :goto_1
    const-class v0, Ll/᩻᩷ۚ;

    monitor-enter v0

    .line 84
    :try_start_d
    sget-object v1, Ll/᩻᩷ۚ;->ۙ:Ll/֫᩷ۚ;

    if-ne v1, v2, :cond_b

    sput-object v4, Ll/᩻᩷ۚ;->ۙ:Ll/֫᩷ۚ;

    .line 85
    :cond_b
    monitor-exit v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 86
    throw p0

    :catchall_7
    move-exception p0

    .line 85
    :try_start_e
    monitor-exit v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    throw p0

    :cond_c
    :try_start_f
    const-string p0, "APK_INSTALL_BUSY"

    const-string v1, "Another installation request is running. Wait for it to finish before retrying."

    const-string v2, "warning"

    .line 57
    invoke-static {v4, p0, v1, v2}, Ll/ۢܳۚ;->ۙ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p0

    throw p0

    :catchall_8
    move-exception p0

    .line 61
    monitor-exit v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    throw p0
.end method

.method public static declared-synchronized ۙ(Ljava/lang/String;Ll/᩹ᩴۚ;)V
    .locals 3

    .line 2
    const-class v0, Ll/᩻᩷ۚ;

    .line 3
    monitor-enter v0

    .line 286
    :try_start_0
    sget-object v1, Ll/᩻᩷ۚ;->ۙ:Ll/֫᩷ۚ;

    if-eqz v1, :cond_2

    .line 287
    iget-object v2, v1, Ll/֫᩷ۚ;->᩷:Ljava/lang/String;

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    iget-boolean p0, v1, Ll/֫᩷ۚ;->ۙ:Z

    if-eqz p0, :cond_0

    goto :goto_3

    :cond_0
    const/4 p0, 0x1

    .line 288
    iput-boolean p0, v1, Ll/֫᩷ۚ;->ۙ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 290
    :try_start_1
    iget-object p0, v1, Ll/֫᩷ۚ;->ᩴ:Ll/ᩴ۫ۚ;

    invoke-virtual {p0}, Ll/ᩴ۫ۚ;->ۙ()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 292
    :try_start_2
    iget-object p0, v1, Ll/֫᩷ۚ;->ۤ:Landroid/content/Intent;

    invoke-virtual {p1, p0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Landroid/content/ActivityNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 294
    :try_start_3
    iget-object v2, v1, Ll/֫᩷ۚ;->ۤ:Landroid/content/Intent;

    invoke-virtual {v2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 295
    iget-object p0, v1, Ll/֫᩷ۚ;->ۤ:Landroid/content/Intent;

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 296
    iget-object p0, v1, Ll/֫᩷ۚ;->ۤ:Landroid/content/Intent;

    invoke-virtual {p1, p0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 298
    :goto_0
    new-instance p0, Ll/᩸۫ۚ;

    const-string p1, "user_action_required"

    const-string v2, "Installation request sent. Continue on the phone to confirm installation."

    invoke-direct {p0, p1, v2}, Ll/᩸۫ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p0, v1, Ll/֫᩷ۚ;->ܳ:Ll/᩸۫ۚ;

    goto :goto_1

    .line 294
    :cond_1
    throw p0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :catch_1
    :try_start_4
    const-string p0, "Cannot open the installation screen. Open MT and retry."

    .line 300
    invoke-static {p0}, Ll/᩻᩷ۚ;->ۙ(Ljava/lang/String;)Ll/᩸۫ۚ;

    move-result-object p0

    iput-object p0, v1, Ll/֫᩷ۚ;->ܳ:Ll/᩸۫ۚ;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 302
    :goto_1
    :try_start_5
    iget-object p0, v1, Ll/֫᩷ۚ;->᩸:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 304
    monitor-exit v0

    return-void

    .line 302
    :goto_2
    :try_start_6
    iget-object p1, v1, Ll/֫᩷ۚ;->᩸:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 303
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 287
    :cond_2
    :goto_3
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    throw p0
.end method

.method public static synthetic ۙ(Ll/֫᩷ۚ;)V
    .locals 5

    .line 261
    const-class v0, Ll/᩻᩷ۚ;

    monitor-enter v0

    .line 262
    :try_start_0
    sget-object v1, Ll/᩻᩷ۚ;->ۙ:Ll/֫᩷ۚ;

    if-ne v1, p0, :cond_1

    iget-boolean v1, p0, Ll/֫᩷ۚ;->ۙ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    goto :goto_1

    .line 264
    :cond_0
    :try_start_1
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object v1

    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object v3

    const-class v4, Ll/᩹ᩴۚ;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "requestId"

    iget-object v4, p0, Ll/֫᩷ۚ;->᩷:Ljava/lang/String;

    .line 265
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    const/high16 v3, 0x10000000

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v2

    .line 264
    invoke-virtual {v1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    const-string v1, "Cannot open the installation screen. Open MT and retry."

    .line 267
    invoke-static {v1}, Ll/᩻᩷ۚ;->ۙ(Ljava/lang/String;)Ll/᩸۫ۚ;

    move-result-object v1

    iput-object v1, p0, Ll/֫᩷ۚ;->ܳ:Ll/᩸۫ۚ;

    const/4 v1, 0x1

    .line 268
    iput-boolean v1, p0, Ll/֫᩷ۚ;->ۙ:Z

    .line 269
    iget-object p0, p0, Ll/֫᩷ۚ;->᩸:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 271
    :goto_0
    monitor-exit v0

    return-void

    .line 262
    :cond_1
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 271
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static ۙ()Z
    .locals 3

    .line 101
    sget-object v0, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    const-string v1, "apk_installation_dhizuku"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 102
    invoke-static {}, Ll/᩵ۙۧ;->ۤ()Ll/᩵ۙۧ;

    move-result-object v0

    const-string v1, "disable_install_by_shizuku"

    invoke-virtual {v0, v1}, Ll/᩵ۙۧ;->ۙ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 104
    :cond_0
    :try_start_0
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/rosan/dhizuku/api/Dhizuku;->init(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/rosan/dhizuku/api/Dhizuku;->isPermissionGranted()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_1

    return v2

    :catch_0
    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ᩷()Z
    .locals 4

    .line 90
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    const/4 v2, 0x0

    if-lt v0, v1, :cond_1

    sget-object v0, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    const-string v1, "apk_installation_shizuku"

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 91
    invoke-static {}, Ll/᩵ۙۧ;->ۤ()Ll/᩵ۙۧ;

    move-result-object v0

    const-string v1, "disable_install_by_shizuku"

    invoke-virtual {v0, v1}, Ll/᩵ۙۧ;->ۙ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 94
    :cond_0
    :try_start_0
    invoke-static {}, Ll/۫ۖۘ;->ܳ()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Ll/۫ۖۘ;->᩷()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_1

    return v3

    :catch_0
    :cond_1
    :goto_0
    return v2
.end method
