.class public final synthetic Ll/۬᩷ܺ;
.super Ljava/lang/Object;
.source "X5CP"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ֡:Ljava/lang/Object;

.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ll/۠ۖۧ;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;Ll/۠ۖۧ;Ll/ۙۤܺ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput v0, p0, Ll/۬᩷ܺ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬᩷ܺ;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/۬᩷ܺ;->ܿ:Ll/۠ۖۧ;

    iput-object p3, p0, Ll/۬᩷ܺ;->֡:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ll/᩸᩷ۚ;Ll/ۨ۫ۚ;Ll/۠ۖۧ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput v0, p0, Ll/۬᩷ܺ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬᩷ܺ;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/۬᩷ܺ;->֡:Ljava/lang/Object;

    iput-object p3, p0, Ll/۬᩷ܺ;->ܿ:Ll/۠ۖۧ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget p1, p0, Ll/۬᩷ܺ;->ܰ:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/۬᩷ܺ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/᩸᩷ۚ;

    .line 11
    iget-object v0, p0, Ll/۬᩷ܺ;->֡:Ljava/lang/Object;

    .line 13
    check-cast v0, Ll/ۨ۫ۚ;

    .line 15
    iget-object v1, p0, Ll/۬᩷ܺ;->ܿ:Ll/۠ۖۧ;

    .line 18
    invoke-static {p1, v0, v1}, Ll/᩸᩷ۚ;->᩷(Ll/᩸᩷ۚ;Ll/ۨ۫ۚ;Ll/۠ۖۧ;)V

    return-void

    .line 21
    :pswitch_0
    iget-object p1, p0, Ll/۬᩷ܺ;->᩶:Ljava/lang/Object;

    .line 23
    check-cast p1, Lbin/mt/plus/Main;

    .line 25
    iget-object v0, p0, Ll/۬᩷ܺ;->֡:Ljava/lang/Object;

    .line 27
    check-cast v0, Ll/ۙۤܺ;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 88
    invoke-static {p1, v1}, Ll/۟֡;->ۙ(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_0

    .line 89
    iget-object p1, p0, Ll/۬᩷ܺ;->ܿ:Ll/۠ۖۧ;

    invoke-virtual {p1}, Ll/۠ۖۧ;->dismiss()V

    .line 90
    invoke-interface {v0}, Ll/ۙۤܺ;->onSuccess()V

    goto :goto_0

    .line 92
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ܽ֡֫;->ۙ(Ljava/lang/String;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
