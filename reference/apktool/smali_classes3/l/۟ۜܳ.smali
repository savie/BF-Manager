.class public final synthetic Ll/۟ۜܳ;
.super Ljava/lang/Object;
.source "X5LN"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۟ۜܳ;->ܰ:I

    iput-object p2, p0, Ll/۟ۜܳ;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/۟ۜܳ;->ܿ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 2
    iget p1, p0, Ll/۟ۜܳ;->ܰ:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/۟ۜܳ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/᩹ۖ᩸;

    .line 11
    iget-object p2, p0, Ll/۟ۜܳ;->ܿ:Ljava/lang/Object;

    .line 13
    check-cast p2, Landroid/widget/CheckBox;

    const-string v0, "\n"

    .line 546
    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 547
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p1, "[TIME] [CLASS]\n->[METHOD]([LOCATION])\n[RESULT]\n--------------------\n"

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/۟ۜܳ;->᩶:Ljava/lang/Object;

    check-cast p1, Ll/᩸۬ܳ;

    iget-object p2, p0, Ll/۟ۜܳ;->ܿ:Ljava/lang/Object;

    check-cast p2, Landroid/widget/BaseAdapter;

    move-object v0, p1

    .line 742
    monitor-enter v0

    .line 743
    :try_start_0
    iget-object p1, p1, Ll/᩸۬ܳ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 744
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 745
    invoke-virtual {p2}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void

    :catchall_0
    move-exception p1

    .line 744
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 549
    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 550
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 552
    :cond_1
    :goto_0
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v0}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v0

    const-string v1, "inject_log_format"

    invoke-interface {v0, v1, p1}, Ll/ᩳ֫ܺ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p1

    invoke-interface {p1}, Ll/ᩳ֫ܺ;->apply()V

    const/4 p1, 0x1

    .line 553
    invoke-virtual {p2, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
