.class public final synthetic Ll/᩻ۚۚ;
.super Ljava/lang/Object;
.source "R78M"

# interfaces
.implements Ljava/util/function/ToIntFunction;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩻ۚۚ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyAsInt(Ljava/lang/Object;)I
    .locals 1

    .line 2
    iget v0, p0, Ll/᩻ۚۚ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/ܿ֨ۗ;

    .line 10
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->ۛ()I

    move-result p1

    return p1

    .line 14
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 87
    invoke-static {p1}, Ll/ܶۚۚ;->ۙ(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const p1, 0x7fffffff

    :cond_0
    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
