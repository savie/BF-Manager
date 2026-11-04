.class public final Ll/ܺۖ֫;
.super Ljava/lang/Object;
.source "E72G"


# instance fields
.field public ۙ:Z

.field public final ۤ:Landroid/webkit/JsResult;

.field public final synthetic ܳ:Ll/ۘۖ֫;

.field public final ᩴ:Landroid/widget/CheckBox;

.field public ᩷:Ll/۠ۖۧ;

.field public final ᩸:Ll/ܽۖ֫;


# direct methods
.method public constructor <init>(Ll/ۘۖ֫;Ll/ܽۖ֫;Landroid/webkit/JsResult;)V
    .locals 0

    .line 1267
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۖ֫;->ܳ:Ll/ۘۖ֫;

    .line 1268
    iput-object p2, p0, Ll/ܺۖ֫;->᩸:Ll/ܽۖ֫;

    .line 1269
    iput-object p3, p0, Ll/ܺۖ֫;->ۤ:Landroid/webkit/JsResult;

    .line 1270
    invoke-static {p2}, Ll/ܽۖ֫;->᩷(Ll/ܽۖ֫;)I

    move-result p2

    const/4 p3, 0x3

    if-lt p2, p3, :cond_0

    const p2, 0x7f0d012f

    .line 1271
    invoke-virtual {p1, p2}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Ll/ܺۖ֫;->ᩴ:Landroid/widget/CheckBox;

    return-void
.end method

.method private ۙ(Ljava/lang/String;ZZ)V
    .locals 3

    .line 1280
    iget-boolean v0, p0, Ll/ܺۖ֫;->ۙ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 1281
    iput-boolean v0, p0, Ll/ܺۖ֫;->ۙ:Z

    .line 1282
    iget-object v0, p0, Ll/ܺۖ֫;->᩸:Ll/ܽۖ֫;

    if-eqz p3, :cond_1

    iget-object p3, p0, Ll/ܺۖ֫;->ᩴ:Landroid/widget/CheckBox;

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {v0}, Ll/ܽۖ֫;->᩸(Ll/ܽۖ֫;)V

    .line 1283
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Ll/ܽۖ֫;->ۙ(Ll/ܽۖ֫;J)V

    .line 1284
    iget-object p3, p0, Ll/ܺۖ֫;->ܳ:Ll/ۘۖ֫;

    invoke-static {p3}, Ll/ۘۖ֫;->֫(Ll/ۘۖ֫;)Ll/ܺۖ֫;

    move-result-object v0

    if-ne v0, p0, :cond_2

    invoke-static {p3}, Ll/ۘۖ֫;->ۘ(Ll/ۘۖ֫;)V

    .line 1285
    :cond_2
    iget-object p3, p0, Ll/ܺۖ֫;->᩷:Ll/۠ۖۧ;

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Ll/۠ۖۧ;->dismiss()V

    .line 1286
    :cond_3
    iget-object p3, p0, Ll/ܺۖ֫;->ۤ:Landroid/webkit/JsResult;

    if-nez p2, :cond_4

    invoke-virtual {p3}, Landroid/webkit/JsResult;->cancel()V

    return-void

    .line 1287
    :cond_4
    instance-of p2, p3, Landroid/webkit/JsPromptResult;

    if-eqz p2, :cond_5

    check-cast p3, Landroid/webkit/JsPromptResult;

    invoke-virtual {p3, p1}, Landroid/webkit/JsPromptResult;->confirm(Ljava/lang/String;)V

    return-void

    .line 1288
    :cond_5
    invoke-virtual {p3}, Landroid/webkit/JsResult;->confirm()V

    return-void
.end method

.method public static synthetic ۙ(Ll/ܺۖ֫;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1276
    invoke-direct {p0, v0, v2, v1}, Ll/ܺۖ֫;->ۙ(Ljava/lang/String;ZZ)V

    return-void
.end method

.method public static ۙ(Ll/ܺۖ֫;Ll/۠ۖۧ;)V
    .locals 1

    .line 1275
    iput-object p1, p0, Ll/ܺۖ֫;->᩷:Ll/۠ۖۧ;

    .line 1276
    new-instance v0, Ll/᩻ۖ֫;

    invoke-direct {v0, p0}, Ll/᩻ۖ֫;-><init>(Ll/ܺۖ֫;)V

    invoke-virtual {p1, v0}, Ll/۠ۖۧ;->ۙ(Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ܺۖ֫;ZLjava/lang/String;Z)V
    .locals 0

    .line 0
    invoke-direct {p0, p2, p1, p3}, Ll/ܺۖ֫;->ۙ(Ljava/lang/String;ZZ)V

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ܺۖ֫;)Landroid/widget/CheckBox;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۖ֫;->ᩴ:Landroid/widget/CheckBox;

    return-object p0
.end method
