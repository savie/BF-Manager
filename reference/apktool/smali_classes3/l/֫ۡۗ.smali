.class public final synthetic Ll/֫ۡۗ;
.super Ljava/lang/Object;
.source "W2ZV"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֫ۡۗ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۙ֡ۨ;)V
    .locals 0

    const/4 p1, 0x2

    .line 0
    iput p1, p0, Ll/֫ۡۗ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/֫ۡۗ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/ۤ۟ۨ;

    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 0
    :pswitch_0
    check-cast p1, Ll/֨֫ۧ;

    const v0, 0x7f0d0047

    .line 212
    invoke-virtual {p1, v0}, Ll/֨֫ۧ;->᩸(I)V

    return-void

    .line 0
    :pswitch_1
    check-cast p1, Ll/ܽۡۗ;

    .line 42
    invoke-virtual {p1}, Ll/ܺ۟ۗ;->ۡ()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
