.class public final synthetic Ll/ᩳ֡ۗ;
.super Ljava/lang/Object;
.source "C6CM"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ll/ۖۡۗ;


# direct methods
.method public synthetic constructor <init>(Ll/ۖۡۗ;Ll/ܽۘۗ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput v0, p0, Ll/ᩳ֡ۗ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ֡ۗ;->᩶:Ll/ۖۡۗ;

    iput-object p2, p0, Ll/ᩳ֡ۗ;->ܿ:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۤ۫᩵;Ll/ۖۡۗ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput v0, p0, Ll/ᩳ֡ۗ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ֡ۗ;->ܿ:Ljava/lang/Object;

    iput-object p2, p0, Ll/ᩳ֡ۗ;->᩶:Ll/ۖۡۗ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ᩳ֡ۗ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ᩳ֡ۗ;->ܿ:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ۤ۫᩵;

    .line 11
    iget-object v1, p0, Ll/ᩳ֡ۗ;->᩶:Ll/ۖۡۗ;

    .line 13
    check-cast p1, Ll/ܿ֨ۗ;

    .line 16
    invoke-static {v0, v1, p1}, Ll/ۤ۫᩵;->ۙ(Ll/ۤ۫᩵;Ll/ۖۡۗ;Ll/ܿ֨ۗ;)V

    return-void

    .line 19
    :pswitch_0
    iget-object v0, p0, Ll/ᩳ֡ۗ;->ܿ:Ljava/lang/Object;

    .line 21
    check-cast v0, Ll/ܽۘۗ;

    .line 23
    check-cast p1, Ljava/lang/String;

    .line 487
    iget-object v1, p0, Ll/ᩳ֡ۗ;->᩶:Ll/ۖۡۗ;

    invoke-static {v1, v0, p1}, Ll/ᩴᩳۗ;->ۙ(Ll/ۛ۟ۗ;Ll/ܽۘۗ;Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
