.class public final synthetic Ll/᩵ۛᩴ;
.super Ljava/lang/Object;
.source "LAQJ"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ֡:Ljava/lang/Object;

.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/᩵ۛᩴ;->ܰ:I

    iput-object p1, p0, Ll/᩵ۛᩴ;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/᩵ۛᩴ;->ܿ:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩵ۛᩴ;->֡:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 2
    iget p1, p0, Ll/᩵ۛᩴ;->ܰ:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/᩵ۛᩴ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/ۡۚ᩸;

    .line 11
    iget-object v0, p0, Ll/᩵ۛᩴ;->ܿ:Ljava/lang/Object;

    .line 13
    check-cast v0, Ll/᩹ۖ᩸;

    .line 15
    iget-object v1, p0, Ll/᩵ۛᩴ;->֡:Ljava/lang/Object;

    .line 17
    check-cast v1, Ll/᩹ۖ᩸;

    .line 106
    invoke-virtual {p1}, Ll/ۡۚ᩸;->ۤ()V

    .line 107
    iget-object v2, p1, Ll/ۡۚ᩸;->ᩴ:Ljava/lang/String;

    iget-object p1, p1, Ll/ۡۚ᩸;->ܳ:Ljava/lang/String;

    invoke-static {v2, p1, v0, v1}, Ll/ۖۚ᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;)V

    return-void

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/᩵ۛᩴ;->᩶:Ljava/lang/Object;

    check-cast p1, [Z

    iget-object v0, p0, Ll/᩵ۛᩴ;->ܿ:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/᩵ۛᩴ;->֡:Ljava/lang/Object;

    check-cast v1, Ll/۠ۖۧ;

    const/4 v2, 0x0

    .line 236
    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_2

    .line 237
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩵ۙܺ;

    invoke-virtual {v3}, Ll/᩵ۙܺ;->᩷()Z

    move-result v3

    if-nez v3, :cond_1

    aget-boolean v3, p1, v2

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v3, 0x1

    .line 238
    :goto_2
    aput-boolean v3, p1, v2

    .line 239
    invoke-virtual {v1}, Ll/۠ۖۧ;->᩷()Ll/᩹ᩴ;

    move-result-object v4

    invoke-virtual {v4, v2, v3}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
