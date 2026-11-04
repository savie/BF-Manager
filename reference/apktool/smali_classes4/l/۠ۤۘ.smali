.class public final synthetic Ll/۠ۤۘ;
.super Ljava/lang/Object;
.source "Y7SB"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ll/᩻᩺᩺;


# direct methods
.method public synthetic constructor <init>(Ll/᩻᩺᩺;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/۠ۤۘ;->ܰ:I

    iput-object p1, p0, Ll/۠ۤۘ;->᩶:Ll/᩻᩺᩺;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 2
    iget v0, p0, Ll/۠ۤۘ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/۠ۤۘ;->᩶:Ll/᩻᩺᩺;

    .line 9
    check-cast v0, Ll/ۖۡ᩺;

    .line 493
    new-instance v1, Ll/ܿᩳۘ;

    invoke-direct {v1}, Ll/ܿᩳۘ;-><init>()V

    .line 494
    new-instance v2, Ll/ۡۡ᩺;

    invoke-direct {v2, v0, v1}, Ll/ۡۡ᩺;-><init>(Ll/ۖۡ᩺;Ll/ܿᩳۘ;)V

    iget-object v3, v0, Ll/ۛۡ᩺;->ۙۙ:Ll/᩷᩶ۘ;

    check-cast v3, Ll/۫ܿۘ;

    iget-object v3, v3, Ll/۫ܿۘ;->ᩳ:Ll/ܰᩳۘ;

    .line 501
    invoke-virtual {v2, v3}, Ll/᩹֡ۘ;->ۙ(Ll/ܰᩳۘ;)V

    .line 502
    invoke-virtual {v1}, Ll/ܿᩳۘ;->ᩴ()Ll/ܰᩳۘ;

    move-result-object v1

    .line 503
    invoke-static {v1}, Ll/ܶۚۗ;->of(Ljava/lang/Object;)Ll/ܶۚۗ;

    move-result-object v2

    iput-object v2, v0, Ll/ۖۡ᩺;->ᩴۙ:Ll/ܶۚۗ;

    return-object v1

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/۠ۤۘ;->᩶:Ll/᩻᩺᩺;

    check-cast v0, Ll/ۧܿ᩺;

    invoke-virtual {v0}, Ll/ۧܿ᩺;->᩷ۙ()Ll/ܰᩳۘ;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
