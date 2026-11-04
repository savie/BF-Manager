.class public final synthetic Ll/᩵ۙܳ;
.super Ljava/lang/Object;
.source "2IQX"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩵ۙܳ;->ܰ:I

    iput-object p2, p0, Ll/᩵ۙܳ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget v0, p0, Ll/᩵ۙܳ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/᩵ۙܳ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/ۗ᩸ۧ;

    .line 12
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    .line 15
    :pswitch_0
    iget-object v0, p0, Ll/᩵ۙܳ;->᩶:Ljava/lang/Object;

    .line 17
    check-cast v0, Ll/᩵᩵֫;

    .line 20
    invoke-static {v0}, Ll/᩵᩵֫;->ۙ(Ll/᩵᩵֫;)V

    return-void

    .line 23
    :pswitch_1
    iget-object v0, p0, Ll/᩵ۙܳ;->᩶:Ljava/lang/Object;

    .line 25
    check-cast v0, Ll/᩸᩻֫;

    .line 28
    invoke-static {v0}, Ll/᩸᩻֫;->ۙ(Ll/᩸᩻֫;)V

    return-void

    .line 31
    :pswitch_2
    iget-object v0, p0, Ll/᩵ۙܳ;->᩶:Ljava/lang/Object;

    .line 33
    check-cast v0, Ljava/lang/String;

    .line 36
    invoke-static {v0}, Ll/֡᩸۫;->ۙ(Ljava/lang/String;)V

    return-void

    .line 39
    :pswitch_3
    iget-object v0, p0, Ll/᩵ۙܳ;->᩶:Ljava/lang/Object;

    .line 41
    check-cast v0, Ll/۠ۖۧ;

    .line 1115
    invoke-virtual {v0}, Ll/۠ۖۧ;->۫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1116
    invoke-virtual {v0}, Ll/۠ۖۧ;->dismiss()V

    :cond_0
    return-void

    .line 0
    :pswitch_4
    iget-object v0, p0, Ll/᩵ۙܳ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ᩳܳܳ;

    .line 239
    :try_start_0
    invoke-virtual {v0}, Ll/ᩳܳܳ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
