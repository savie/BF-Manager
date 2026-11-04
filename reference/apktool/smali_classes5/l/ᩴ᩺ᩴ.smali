.class public final Ll/ᩴ᩺ᩴ;
.super Lcom/rosan/dhizuku/api/DhizukuRequestPermissionListener;
.source "LAQJ"


# instance fields
.field public final synthetic ܳ:Ll/ۛ᩺ᩴ;

.field public ᩴ:Z


# direct methods
.method public constructor <init>(Ll/ۛ᩺ᩴ;)V
    .locals 0

    .line 1059
    iput-object p1, p0, Ll/ᩴ᩺ᩴ;->ܳ:Ll/ۛ᩺ᩴ;

    invoke-direct {p0}, Lcom/rosan/dhizuku/api/DhizukuRequestPermissionListener;-><init>()V

    const/4 p1, 0x0

    .line 1060
    iput-boolean p1, p0, Ll/ᩴ᩺ᩴ;->ᩴ:Z

    return-void
.end method


# virtual methods
.method public final onRequestPermission(I)V
    .locals 1

    .line 1064
    iget-boolean v0, p0, Ll/ᩴ᩺ᩴ;->ᩴ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 1067
    iput-boolean v0, p0, Ll/ᩴ᩺ᩴ;->ᩴ:Z

    .line 1068
    iget-object v0, p0, Ll/ᩴ᩺ᩴ;->ܳ:Ll/ۛ᩺ᩴ;

    if-nez p1, :cond_1

    .line 1069
    sget-object p1, Ll/ܶ᩺ᩴ;->᩶:Ll/ܶ᩺ᩴ;

    invoke-virtual {v0, p1}, Ll/ۛ᩺ᩴ;->ۙ(Ll/ܶ᩺ᩴ;)V

    return-void

    .line 1071
    :cond_1
    sget-object p1, Ll/ܶ᩺ᩴ;->᩶:Ll/ܶ᩺ᩴ;

    invoke-virtual {v0, p1}, Ll/ۛ᩺ᩴ;->᩷(Ll/ܶ᩺ᩴ;)V

    return-void
.end method
