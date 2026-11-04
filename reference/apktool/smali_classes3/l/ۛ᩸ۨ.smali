.class public abstract Ll/ۛ᩸ۨ;
.super Ljava/lang/Object;
.source "Q7W7"

# interfaces
.implements Ll/ܰ᩸᩵;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۛ᩸ۨ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 2
    iget v0, p0, Ll/ۛ᩸ۨ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 8
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 70
    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public abstract ۙ([BII)I
.end method

.method public ۙ(Ll/ۖۡۗ;Ll/᩹ۡۗ;)V
    .locals 0

    return-void
.end method

.method public ۤ(Ll/ۖۡۗ;Ll/ܿۡۗ;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public ᩷(Ll/ۖۡۗ;Ll/ܿۡۗ;)V
    .locals 0

    return-void
.end method
