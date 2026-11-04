.class public final Ll/ܳ᩺ᩴ;
.super Ljava/lang/Object;
.source "LAQJ"

# interfaces
.implements Ll/᩵᩺ᩴ;


# instance fields
.field public final synthetic ۙ:Ll/ۛ᩺ᩴ;


# direct methods
.method public constructor <init>(Ll/ۛ᩺ᩴ;)V
    .locals 0

    .line 1077
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳ᩺ᩴ;->ۙ:Ll/ۛ᩺ᩴ;

    return-void
.end method


# virtual methods
.method public final ۙ(Landroid/content/pm/PackageInstaller$SessionParams;)Landroid/content/pm/PackageInstaller$Session;
    .locals 4

    .line 132
    invoke-static {}, Ll/֫ۘᩴ;->ۙ()Landroid/content/pm/IPackageInstaller;

    move-result-object v0

    .line 1082
    iget-object v1, p0, Ll/ܳ᩺ᩴ;->ۙ:Ll/ۛ᩺ᩴ;

    invoke-virtual {v1}, Ll/ۛ᩺ᩴ;->ۙ()V

    .line 1083
    invoke-static {}, Lcom/rosan/dhizuku/api/Dhizuku;->getOwnerPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 1084
    invoke-static {v0, v1, v2, v3}, Ll/ܺۘᩴ;->ۙ(Landroid/content/pm/IPackageInstaller;Ljava/lang/String;Ljava/lang/String;I)Landroid/content/pm/PackageInstaller;

    move-result-object v1

    .line 1085
    invoke-virtual {v1, p1}, Landroid/content/pm/PackageInstaller;->createSession(Landroid/content/pm/PackageInstaller$SessionParams;)I

    move-result p1

    .line 1086
    invoke-interface {v0, p1}, Landroid/content/pm/IPackageInstaller;->openSession(I)Landroid/content/pm/IPackageInstallerSession;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/pm/IPackageInstallerSession;->asBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/rosan/dhizuku/api/Dhizuku;->binderWrapper(Landroid/os/IBinder;)Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Landroid/content/pm/IPackageInstallerSession$Stub;->asInterface(Landroid/os/IBinder;)Landroid/content/pm/IPackageInstallerSession;

    move-result-object p1

    .line 1087
    invoke-static {p1}, Ll/ܺۘᩴ;->ۙ(Landroid/content/pm/IPackageInstallerSession;)Landroid/content/pm/PackageInstaller$Session;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ()V
    .locals 2

    .line 1092
    iget-object v0, p0, Ll/ܳ᩺ᩴ;->ۙ:Ll/ۛ᩺ᩴ;

    sget-object v1, Ll/ܶ᩺ᩴ;->᩶:Ll/ܶ᩺ᩴ;

    invoke-virtual {v0, v1}, Ll/ۛ᩺ᩴ;->᩷(Ll/ܶ᩺ᩴ;)V

    return-void
.end method
