.class public final synthetic Ll/᩹ۙ۫;
.super Ljava/lang/Object;
.source "X4HD"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩹ۙ۫;->ܰ:I

    iput-object p2, p0, Ll/᩹ۙ۫;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget v0, p0, Ll/᩹ۙ۫;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/᩹ۙ۫;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;

    .line 12
    invoke-static {v0}, Lbin/mt/plugin/api/ui/dialog/ProgressDialog;->$r8$lambda$nza1UqYLXW35VbrTZGCc_AGDSIU(Lbin/mt/plugin/api/ui/dialog/ProgressDialog;)V

    return-void

    .line 15
    :pswitch_0
    iget-object v0, p0, Ll/᩹ۙ۫;->᩶:Ljava/lang/Object;

    .line 17
    check-cast v0, Ll/ܽ֡֫;

    const-string v1, "def_sign_key_warn"

    const v2, 0x7f120239

    .line 343
    invoke-static {v2, v0, v1}, Ll/۫۠ᩴ;->᩷(ILl/ܽ֡֫;Ljava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
