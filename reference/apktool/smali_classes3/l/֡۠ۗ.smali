.class public final synthetic Ll/֡۠ۗ;
.super Ljava/lang/Object;
.source "EIX3"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֡۠ۗ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 5

    .line 2
    iget v0, p0, Ll/֡۠ۗ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/֨֫ۧ;

    .line 9
    sget v0, Ll/ܶ᩶ۧ;->ۨۙ:I

    const v0, 0x7f0d0047

    .line 225
    invoke-virtual {p1, v0}, Ll/֨֫ۧ;->᩸(I)V

    return-void

    .line 0
    :pswitch_0
    check-cast p1, Ll/ۖۡۗ;

    .line 323
    invoke-virtual {p1}, Ll/ۖۡۗ;->۫ۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 326
    :cond_0
    invoke-virtual {p1}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v0

    .line 327
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܳ᩷()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ll/ۢᩳۗ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 328
    :goto_0
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܳ᩷()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v3

    sget-object v4, Ll/֫۟ۗ;->۠:Ll/֫۟ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    .line 329
    :goto_1
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩷ۢۗ;->᩹()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v0}, Ll/ۢᩳۗ;->ܶ()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v2, 0x1

    :cond_3
    if-nez v1, :cond_4

    if-nez v3, :cond_4

    if-eqz v2, :cond_9

    .line 331
    :cond_4
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/᩹֫᩵;->ۤ(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    if-eqz v2, :cond_6

    .line 335
    sget-object v0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto :goto_2

    .line 338
    :cond_6
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚ᩷()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 348
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v0

    .line 349
    invoke-virtual {v0}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۡۗ;

    if-eq v1, p1, :cond_7

    .line 351
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܳ᩷()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 352
    invoke-virtual {v1}, Ll/ۖۡۗ;->ۚ᩷()Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_2

    .line 339
    :cond_8
    sget-object v0, Ll/᩻᩶ۗ;->ۤ:Ll/᩻᩶ۗ;

    .line 340
    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 341
    sget-object v0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    :cond_9
    :goto_2
    return-void

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
