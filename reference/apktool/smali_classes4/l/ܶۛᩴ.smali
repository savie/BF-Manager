.class public final synthetic Ll/ܶۛᩴ;
.super Ljava/lang/Object;
.source "LAQJ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܶۛᩴ;->ܰ:I

    iput-object p2, p0, Ll/ܶۛᩴ;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/ܶۛᩴ;->ܿ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget v0, p0, Ll/ܶۛᩴ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ܶۛᩴ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/᩸ܰᩴ;

    .line 11
    iget-object v1, p0, Ll/ܶۛᩴ;->ܿ:Ljava/lang/Object;

    .line 13
    check-cast v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 880
    invoke-virtual {v0, v1}, Ll/᩸ܰᩴ;->ۙ(Landroid/graphics/drawable/BitmapDrawable;)V

    return-void

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ܶۛᩴ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܽ֡֫;

    iget-object v1, p0, Ll/ܶۛᩴ;->ܿ:Ljava/lang/Object;

    check-cast v1, Ll/᩷ۨᩴ;

    const/4 v2, 0x0

    .line 186
    invoke-static {v0, v1, v2}, Ll/۟᩺ᩴ;->ۙ(Ll/ܽ֡֫;Ll/᩷ۨᩴ;Ljava/util/List;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
