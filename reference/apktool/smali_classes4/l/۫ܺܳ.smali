.class public Ll/۫ܺܳ;
.super Ll/ܽ֡֫;
.source "CIVR"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ll/ܽ֡֫;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 11
    invoke-super {p0, p1}, Ll/ܽ֡֫;->onCreate(Landroid/os/Bundle;)V

    .line 12
    invoke-virtual {p0}, Ll/ܽ֡֫;->۠()V

    .line 13
    new-instance p1, Ll/᩶ܺܳ;

    invoke-direct {p1, p0}, Ll/᩶ܺܳ;-><init>(Ll/ܽ֡֫;)V

    invoke-virtual {p1}, Ll/᩶ܺܳ;->ۙ()V

    return-void
.end method

.method public final ᩶()Ljava/lang/String;
    .locals 1

    const-string v0, "InspectorActivity"

    return-object v0
.end method
