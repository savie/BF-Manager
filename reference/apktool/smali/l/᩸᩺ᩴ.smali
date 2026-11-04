.class public final Ll/᩸᩺ᩴ;
.super Ljava/lang/Object;
.source "LAQJ"

# interfaces
.implements Ll/᩵᩺ᩴ;


# instance fields
.field public final synthetic ۙ:Ll/ۛ᩺ᩴ;


# direct methods
.method public constructor <init>(Ll/ۛ᩺ᩴ;)V
    .locals 0

    .line 1022
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸᩺ᩴ;->ۙ:Ll/ۛ᩺ᩴ;

    return-void
.end method


# virtual methods
.method public final ۙ(Landroid/content/pm/PackageInstaller$SessionParams;)Landroid/content/pm/PackageInstaller$Session;
    .locals 6

    .line 100
    invoke-static {}, Ll/᩻ۘᩴ;->᩷()Landroid/content/pm/IPackageInstaller;

    move-result-object v0

    .line 1026
    invoke-static {}, Ll/۫ۖۘ;->᩸()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 1028
    :goto_0
    iget-object v3, p0, Ll/᩸᩺ᩴ;->ۙ:Ll/ۛ᩺ᩴ;

    if-eqz v1, :cond_1

    invoke-static {v3}, Ll/ۛ᩺ᩴ;->ۙ(Ll/ۛ᩺ᩴ;)Ll/ܽ֡֫;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    const-string v4, "com.android.shell"

    :goto_1
    if-eqz v1, :cond_2

    .line 1029
    invoke-static {}, Landroid/os/Process;->myUserHandle()Landroid/os/UserHandle;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/UserHandle;->hashCode()I

    move-result v2

    .line 1030
    :cond_2
    invoke-static {v3}, Ll/ۛ᩺ᩴ;->ۤ(Ll/ۛ᩺ᩴ;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/ܺۘᩴ;->ۙ(ILjava/lang/String;)V

    .line 1031
    invoke-static {v3}, Ll/ۛ᩺ᩴ;->ۤ(Ll/ۛ᩺ᩴ;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v4, v1}, Ll/ܺۘᩴ;->ۙ(Landroid/content/pm/PackageInstaller$SessionParams;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1032
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1f

    if-lt v4, v5, :cond_3

    invoke-static {v3}, Ll/ۛ᩺ᩴ;->ۙ(Ll/ۛ᩺ᩴ;)Ll/ܽ֡֫;

    move-result-object v3

    invoke-virtual {v3}, Landroid/app/Activity;->getAttributionTag()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    .line 1033
    :goto_2
    invoke-static {v0, v1, v3, v2}, Ll/ܺۘᩴ;->ۙ(Landroid/content/pm/IPackageInstaller;Ljava/lang/String;Ljava/lang/String;I)Landroid/content/pm/PackageInstaller;

    move-result-object v1

    .line 1034
    invoke-virtual {v1, p1}, Landroid/content/pm/PackageInstaller;->createSession(Landroid/content/pm/PackageInstaller$SessionParams;)I

    move-result p1

    .line 1035
    new-instance v1, Ll/ۚۖۘ;

    invoke-interface {v0, p1}, Landroid/content/pm/IPackageInstaller;->openSession(I)Landroid/content/pm/IPackageInstallerSession;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/pm/IPackageInstallerSession;->asBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-direct {v1, p1}, Ll/ۚۖۘ;-><init>(Landroid/os/IBinder;)V

    invoke-static {v1}, Landroid/content/pm/IPackageInstallerSession$Stub;->asInterface(Landroid/os/IBinder;)Landroid/content/pm/IPackageInstallerSession;

    move-result-object p1

    .line 1036
    invoke-static {p1}, Ll/ܺۘᩴ;->ۙ(Landroid/content/pm/IPackageInstallerSession;)Landroid/content/pm/PackageInstaller$Session;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ()V
    .locals 2

    .line 1041
    iget-object v0, p0, Ll/᩸᩺ᩴ;->ۙ:Ll/ۛ᩺ᩴ;

    sget-object v1, Ll/ܶ᩺ᩴ;->֡:Ll/ܶ᩺ᩴ;

    invoke-virtual {v0, v1}, Ll/ۛ᩺ᩴ;->᩷(Ll/ܶ᩺ᩴ;)V

    return-void
.end method
