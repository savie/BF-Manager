.class public final synthetic Ll/᩵᩻᩸;
.super Ljava/lang/Object;
.source "N1X5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ljava/lang/Object;

.field public final synthetic ۟:Ljava/lang/Object;

.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p5, p0, Ll/᩵᩻᩸;->ܰ:I

    iput-object p1, p0, Ll/᩵᩻᩸;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/᩵᩻᩸;->ܿ:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩵᩻᩸;->֡:Ljava/lang/Object;

    iput-object p4, p0, Ll/᩵᩻᩸;->۟:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 2
    iget v0, p0, Ll/᩵᩻᩸;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/᩵᩻᩸;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ljava/util/List;

    .line 11
    iget-object v1, p0, Ll/᩵᩻᩸;->ܿ:Ljava/lang/Object;

    .line 13
    check-cast v1, Landroid/widget/TextView;

    .line 15
    iget-object v2, p0, Ll/᩵᩻᩸;->֡:Ljava/lang/Object;

    .line 17
    check-cast v2, Landroid/widget/TextView;

    .line 19
    iget-object v3, p0, Ll/᩵᩻᩸;->۟:Ljava/lang/Object;

    .line 21
    check-cast v3, Ll/۟ۘܳ;

    const/16 v4, 0x12c

    .line 148
    invoke-static {v4}, Ll/᩻֫ܺ;->ۙ(I)Ll/᩻֫ܺ;

    move-result-object v4

    .line 151
    new-instance v5, Ljava/util/LinkedList;

    invoke-direct {v5, v0}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/᩵᩻᩸;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܰ᩻᩸;

    iget-object v1, p0, Ll/᩵᩻᩸;->ܿ:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v2, p0, Ll/᩵᩻᩸;->֡:Ljava/lang/Object;

    check-cast v2, Landroid/app/Application;

    iget-object v3, p0, Ll/᩵᩻᩸;->۟:Ljava/lang/Object;

    check-cast v3, Landroid/content/ServiceConnection;

    invoke-static {v0, v1, v2, v3}, Ll/ܰ᩻᩸;->ۙ(Ll/ܰ᩻᩸;Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/app/Application;Landroid/content/ServiceConnection;)V

    return-void

    .line 152
    :goto_0
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_2

    const/4 v8, 0x1

    add-int/2addr v7, v8

    and-int/lit16 v9, v7, 0xff

    if-nez v9, :cond_0

    .line 153
    invoke-virtual {v4}, Ll/᩻֫ܺ;->ۙ()Z

    move-result v9

    if-eqz v9, :cond_0

    .line 156
    new-instance v9, Ll/ۜۡ۫;

    invoke-direct {v9, v1, v0, v2, v6}, Ll/ۜۡ۫;-><init>(Landroid/widget/TextView;ILandroid/widget/TextView;I)V

    invoke-static {v9}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    .line 161
    :cond_0
    invoke-virtual {v5}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۖۗܳ;

    .line 162
    invoke-interface {v9}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v10

    if-eqz v10, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 167
    :try_start_0
    invoke-interface {v9}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v9

    .line 199
    invoke-virtual {v3, v9, v8}, Ll/۟ۘܳ;->ۙ(Ljava/lang/String;Z)Ljava/util/ArrayList;

    move-result-object v8

    .line 167
    invoke-virtual {v5, v8}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    .line 175
    :cond_2
    new-instance v3, Ll/۬ۡ۫;

    invoke-direct {v3, v1, v0, v2, v6}, Ll/۬ۡ۫;-><init>(Landroid/widget/TextView;ILandroid/widget/TextView;I)V

    invoke-static {v3}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
