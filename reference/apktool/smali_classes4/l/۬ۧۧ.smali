.class public final synthetic Ll/۬ۧۧ;
.super Ljava/lang/Object;
.source "51FV"

# interfaces
.implements Ll/֫ܶ᩵;
.implements Ll/ܽۧܺ;
.implements Lbin/mt/plugin/api/util/Consumer;
.implements Ll/᩺ۘ᩷;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۬ۧۧ;->ܰ:I

    iput-object p2, p0, Ll/۬ۧۧ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/۬ۧۧ;->᩶:Ljava/lang/Object;

    check-cast v0, Lbin/mt/plugin/api/ui/PluginProgressBar;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/PluginProgressBar;->setSecondaryProgress(I)V

    return-void
.end method

.method public ۙ(Ll/ۘۘ᩷;)Ljava/lang/CharSequence;
    .locals 5

    .line 2
    iget-object p1, p0, Ll/۬ۧۧ;->᩶:Ljava/lang/Object;

    .line 4
    check-cast p1, Ll/ܿܳۧ;

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    invoke-static {}, Ll/ۘ᩷ۧ;->ۙ()I

    move-result v0

    .line 35
    invoke-virtual {p1}, Ll/ۘۘ᩷;->ۙ()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Ll/᩺᩷ۧ;->ۙ(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v1

    .line 36
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x3

    if-ge v3, v4, :cond_1

    const/4 v4, 0x1

    shl-int/2addr v4, v3

    and-int/2addr v4, v0

    if-eqz v4, :cond_0

    .line 39
    aget-object v4, v1, v3

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ll/ۘۘ᩷;->ۙ()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f120b97

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    const-string p1, ", "

    .line 43
    invoke-static {p1, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ۙ(I)V
    .locals 1

    .line 0
    iget v0, p0, Ll/۬ۧۧ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    iget-object v0, p0, Ll/۬ۧۧ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ۢܽ۫;

    invoke-virtual {v0, p1}, Ll/ᩳۜۧ;->ۧ(I)V

    return-void

    :pswitch_1
    iget-object v0, p0, Ll/۬ۧۧ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/۟۟ܳ;

    invoke-virtual {v0, p1}, Ll/ᩳۜۧ;->ۧ(I)V

    return-void

    :pswitch_2
    iget-object v0, p0, Ll/۬ۧۧ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ۘۧۧ;

    invoke-interface {v0, p1}, Ll/ۘۧۧ;->ۙ(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public ᩷(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/۬ۧۧ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/᩺ۤᩴ;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, p2}, Ll/᩺ۤᩴ;->ۙ(Ll/᩺ۤᩴ;Ljava/lang/Throwable;)V

    return-void
.end method
