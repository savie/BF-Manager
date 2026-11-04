.class public final Ll/۟ܽܳ;
.super Ll/ۚ᩹ܳ;
.source "VITQ"


# instance fields
.field public ֡:Landroid/accessibilityservice/AccessibilityService;

.field public ܿ:I

.field public final ᩶:Ll/ۛۤᩴ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x51

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    return-void
.end method

.method public constructor <init>(Ll/ۛۤᩴ;)V
    .locals 1

    .line 20
    sget-object v0, Ll/۫᩹ܳ;->᩶:Ll/۫᩹ܳ;

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Ll/۟ܽܳ;->᩶:Ll/ۛۤᩴ;

    return-void
.end method


# virtual methods
.method public native ۙ(Landroid/os/Bundle;)Ljava/lang/String;
.end method

.method public final ۤ()V
    .locals 1

    const/4 v0, 0x0

    .line 51
    iput-object v0, p0, Ll/۟ܽܳ;->֡:Landroid/accessibilityservice/AccessibilityService;

    return-void
.end method

.method public final ᩷(Landroid/os/Bundle;)V
    .locals 2

    .line 26
    iget-object v0, p0, Ll/۟ܽܳ;->᩶:Ll/ۛۤᩴ;

    iget-object v0, v0, Ll/ۛۤᩴ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/᩶ܶܳ;

    invoke-static {v0}, Ll/᩶ܶܳ;->ۙ(Ll/᩶ܶܳ;)Landroid/accessibilityservice/AccessibilityService;

    move-result-object v0

    iput-object v0, p0, Ll/۟ܽܳ;->֡:Landroid/accessibilityservice/AccessibilityService;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 28
    iput v0, p0, Ll/۟ܽܳ;->ܿ:I

    const-string v0, "uid"

    .line 29
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-void

    .line 27
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Accessibility service is not connected"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
