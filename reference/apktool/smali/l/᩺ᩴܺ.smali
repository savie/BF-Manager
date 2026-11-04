.class public final synthetic Ll/᩺ᩴܺ;
.super Ljava/lang/Object;
.source "11V2"

# interfaces
.implements Ll/᩶ۚܺ;
.implements Ll/ܽۧܺ;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩺ᩴܺ;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۙ(I)V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/᩺ᩴܺ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۘᩴܺ;

    int-to-float p1, p1

    const v1, 0x3ecccccd    # 0.4f

    mul-float p1, p1, v1

    float-to-int p1, p1

    add-int/lit8 p1, p1, 0x3c

    .line 134
    invoke-interface {v0, p1}, Ll/ۘᩴܺ;->ۙ(I)V

    return-void
.end method

.method public ᩷()Landroid/graphics/Bitmap;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/᩺ᩴܺ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/᩷ۨᩴ;

    .line 259
    invoke-static {v0}, Ll/۠֡᩻;->ۙ(Ll/᩷ۨᩴ;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
