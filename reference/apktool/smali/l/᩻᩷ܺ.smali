.class public final synthetic Ll/᩻᩷ܺ;
.super Ljava/lang/Object;
.source "84GP"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Throwable;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Throwable;I)V
    .locals 0

    .line 0
    iput p3, p0, Ll/᩻᩷ܺ;->ܰ:I

    iput-object p1, p0, Ll/᩻᩷ܺ;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/᩻᩷ܺ;->ܿ:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    iget v0, p0, Ll/᩻᩷ܺ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/᩻᩷ܺ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Landroid/widget/TextView;

    .line 11
    iget-object v1, p0, Ll/᩻᩷ܺ;->ܿ:Ljava/lang/Throwable;

    .line 408
    invoke-virtual {v1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 409
    sget v1, Ll/ۗۡ֫;->᩸ۙ:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/᩻᩷ܺ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܺ᩷ܺ;

    .line 44
    new-instance v1, Ljava/io/IOException;

    iget-object v2, p0, Ll/᩻᩷ܺ;->ܿ:Ljava/lang/Throwable;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, Ll/ܺ᩷ܺ;->ۙ(Ljava/io/IOException;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
