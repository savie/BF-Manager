.class public final synthetic Ll/ۤ᩵ܳ;
.super Ljava/lang/Object;
.source "C76R"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ֡:Ll/֫ۖ᩸;

.field public final synthetic ۟:Z

.field public final synthetic ۢ:Ll/۠ۖۧ;

.field public final synthetic ܰ:Ll/᩹ۖ᩸;

.field public final synthetic ܿ:Ll/֫ۖ᩸;

.field public final synthetic ᩳ:Ll/᩻᩵ܳ;

.field public final synthetic ᩶:Ll/᩹ۖ᩸;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;Ll/֫ۖ᩸;Ll/֫ۖ᩸;ZLl/᩻᩵ܳ;Ll/۠ۖۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤ᩵ܳ;->ܰ:Ll/᩹ۖ᩸;

    iput-object p2, p0, Ll/ۤ᩵ܳ;->᩶:Ll/᩹ۖ᩸;

    iput-object p3, p0, Ll/ۤ᩵ܳ;->ܿ:Ll/֫ۖ᩸;

    iput-object p4, p0, Ll/ۤ᩵ܳ;->֡:Ll/֫ۖ᩸;

    iput-boolean p5, p0, Ll/ۤ᩵ܳ;->۟:Z

    iput-object p6, p0, Ll/ۤ᩵ܳ;->ᩳ:Ll/᩻᩵ܳ;

    iput-object p7, p0, Ll/ۤ᩵ܳ;->ۢ:Ll/۠ۖۧ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 14

    .line 168
    iget-object p1, p0, Ll/ۤ᩵ܳ;->ܰ:Ll/᩹ۖ᩸;

    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 169
    iget-object v1, p0, Ll/ۤ᩵ܳ;->᩶:Ll/᩹ۖ᩸;

    invoke-virtual {v1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 170
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    iget-object v4, p0, Ll/ۤ᩵ܳ;->ܿ:Ll/֫ۖ᩸;

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 171
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    const p1, 0x7f120306

    .line 172
    invoke-static {p1}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return-void

    .line 175
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    const-wide/16 v5, -0x1

    if-eqz v3, :cond_1

    move-wide v7, v5

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ll/ܺ᩵ܳ;->᩷(Ljava/lang/String;)J

    move-result-wide v7

    .line 176
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    const v9, 0x7f12022e

    const-wide/16 v10, 0x0

    if-nez v3, :cond_2

    cmp-long v3, v7, v10

    if-gez v3, :cond_2

    .line 177
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 178
    invoke-static {v9}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return-void

    .line 181
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    move-wide v12, v5

    goto :goto_1

    :cond_3
    invoke-static {v2}, Ll/ܺ᩵ܳ;->᩷(Ljava/lang/String;)J

    move-result-wide v12

    .line 182
    :goto_1
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_4

    cmp-long v3, v12, v10

    if-gez v3, :cond_4

    .line 183
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 184
    invoke-static {v9}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ۤ᩵ܳ;->֡:Ll/֫ۖ᩸;

    invoke-virtual {v0, p1}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return-void

    :cond_4
    cmp-long v1, v7, v5

    if-eqz v1, :cond_5

    cmp-long v1, v12, v5

    if-eqz v1, :cond_5

    cmp-long v1, v7, v12

    if-ltz v1, :cond_5

    .line 188
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    const p1, 0x7f1207e9

    .line 189
    invoke-static {p1}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return-void

    .line 192
    :cond_5
    iget-boolean p1, p0, Ll/ۤ᩵ܳ;->۟:Z

    if-eqz p1, :cond_6

    .line 193
    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {p1}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p1

    const-string v1, "smint"

    invoke-interface {p1, v1, v0}, Ll/ᩳ֫ܺ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p1

    const-string v0, "smaxt"

    .line 194
    invoke-interface {p1, v0, v2}, Ll/ᩳ֫ܺ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p1

    .line 195
    invoke-interface {p1}, Ll/ᩳ֫ܺ;->apply()V

    .line 197
    :cond_6
    iget-object p1, p0, Ll/ۤ᩵ܳ;->ᩳ:Ll/᩻᩵ܳ;

    invoke-interface {p1, v7, v8, v12, v13}, Ll/᩻᩵ܳ;->ۙ(JJ)V

    .line 198
    iget-object p1, p0, Ll/ۤ᩵ܳ;->ۢ:Ll/۠ۖۧ;

    invoke-virtual {p1}, Ll/۠ۖۧ;->dismiss()V

    return-void
.end method
