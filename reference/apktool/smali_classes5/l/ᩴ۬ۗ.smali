.class public final synthetic Ll/ᩴ۬ۗ;
.super Ljava/lang/Object;
.source "Z6EN"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:Ll/ۖۡۗ;

.field public final synthetic ᩶:Ll/ۖۡۗ;


# direct methods
.method public synthetic constructor <init>(Ll/ۚ۬ۗ;Ll/ۖۡۗ;Ll/ۖۡۗ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ᩴ۬ۗ;->ܰ:Ll/ۖۡۗ;

    iput-object p3, p0, Ll/ᩴ۬ۗ;->᩶:Ll/ۖۡۗ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 2
    check-cast p1, Ll/ᩳۡۗ;

    .line 169
    sget-object v0, Ll/۫۬ۗ;->ۙ:[I

    invoke-virtual {p1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    iget-object v1, p0, Ll/ᩴ۬ۗ;->ܰ:Ll/ۖۡۗ;

    iget-object v2, p0, Ll/ᩴ۬ۗ;->᩶:Ll/ۖۡۗ;

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 184
    :pswitch_0
    check-cast p1, Ll/ۗۢۗ;

    invoke-virtual {p1}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬ᩳۗ;

    .line 185
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֫ۖۗ;->ۙ(Ll/۬ᩳۗ;)Ll/ܽۡۗ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 187
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ll/ܽۡۗ;->ۤۙ()Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0, v2, v1}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;Ll/ۨᩳۗ;Ll/ۨᩳۗ;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ܽۡۗ;->᩷(Ljava/util/List;)V

    .line 188
    invoke-virtual {p1}, Ll/ܽۡۗ;->᩷ۙ()Ll/᩻ۡۗ;

    move-result-object p1

    .line 196
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ۡۙ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v2, v1}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;Ll/ۨᩳۗ;Ll/ۨᩳۗ;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩻ۡۗ;->᩸(Ljava/util/List;)V

    .line 197
    invoke-virtual {p1}, Ll/᩻ۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v2

    invoke-virtual {v1}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v1

    invoke-static {v0, v2, v1}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;Ll/ۨᩳۗ;Ll/ۨᩳۗ;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩻ۡۗ;->ۤ(Ljava/util/List;)V

    return-void

    .line 172
    :pswitch_1
    check-cast p1, Ll/ܳۢۗ;

    invoke-virtual {p1}, Ll/ܳۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object p1

    .line 173
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֫ۖۗ;->ۙ(Ll/᩷ۢۗ;)Ll/ۖۡۗ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 175
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0, v2, v1}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;Ll/ۨᩳۗ;Ll/ۨᩳۗ;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۖۡۗ;->ۤ(Ljava/util/List;)V

    .line 176
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object p1

    .line 196
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ۡۙ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v2, v1}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;Ll/ۨᩳۗ;Ll/ۨᩳۗ;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩻ۡۗ;->᩸(Ljava/util/List;)V

    .line 197
    invoke-virtual {p1}, Ll/᩻ۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v2

    invoke-virtual {v1}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v1

    invoke-static {v0, v2, v1}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;Ll/ۨᩳۗ;Ll/ۨᩳۗ;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩻ۡۗ;->ۤ(Ljava/util/List;)V

    :cond_0
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
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
