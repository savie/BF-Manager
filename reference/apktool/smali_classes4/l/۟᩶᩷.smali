.class public Ll/۟᩶᩷;
.super Ljava/lang/Object;
.source "79M1"

# interfaces
.implements Ll/ۖۢ᩷;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Landroid/content/Context;)Ljava/lang/Object;
    .locals 2

    .line 75
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_0

    .line 77
    new-instance p1, Ll/֡᩶᩷;

    .line 142
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1

    .line 81
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 83
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    new-instance v1, Ll/᩶᩶᩷;

    invoke-direct {v1, p0, p1}, Ll/᩶᩶᩷;-><init>(Ll/۟᩶᩷;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 85
    new-instance p1, Ll/֡᩶᩷;

    .line 142
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1
.end method

.method public final ۙ()Ljava/util/List;
    .locals 1

    .line 117
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method
