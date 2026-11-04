.class public final synthetic Ll/֡᩺ۤ;
.super Ljava/lang/Object;
.source "097X"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


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
    iput p5, p0, Ll/֡᩺ۤ;->ܰ:I

    iput-object p1, p0, Ll/֡᩺ۤ;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/֡᩺ۤ;->ܿ:Ljava/lang/Object;

    iput-object p3, p0, Ll/֡᩺ۤ;->֡:Ljava/lang/Object;

    iput-object p4, p0, Ll/֡᩺ۤ;->۟:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    .line 2
    iget p1, p0, Ll/֡᩺ۤ;->ܰ:I

    .line 4
    iget-object p2, p0, Ll/֡᩺ۤ;->۟:Ljava/lang/Object;

    .line 6
    iget-object v0, p0, Ll/֡᩺ۤ;->֡:Ljava/lang/Object;

    .line 8
    iget-object v1, p0, Ll/֡᩺ۤ;->ܿ:Ljava/lang/Object;

    .line 10
    iget-object v2, p0, Ll/֡᩺ۤ;->᩶:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    .line 15
    check-cast v2, Ll/ᩳ᩺ۧ;

    .line 17
    check-cast v1, Ll/۠ۖۧ;

    .line 19
    check-cast v0, Ll/᩺֨᩵;

    .line 21
    check-cast p2, Ljava/lang/String;

    .line 24
    invoke-static {v2, v1, v0, p2}, Ll/ᩳ᩺ۧ;->ۙ(Ll/ᩳ᩺ۧ;Ll/۠ۖۧ;Ll/᩺֨᩵;Ljava/lang/String;)V

    return-void

    .line 27
    :pswitch_0
    check-cast v2, Ll/ۡۚ᩸;

    .line 29
    check-cast v1, Landroid/widget/CheckBox;

    .line 31
    check-cast v0, Landroid/widget/CheckBox;

    .line 33
    check-cast p2, Ll/۠ۨܳ;

    .line 340
    invoke-virtual {v2}, Ll/ۡۚ᩸;->ۙ()V

    .line 341
    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {p1}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p1

    const-string v3, "aciad"

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v4

    invoke-interface {p1, v3, v4}, Ll/ᩳ֫ܺ;->putBoolean(Ljava/lang/String;Z)Ll/ᩳ֫ܺ;

    move-result-object p1

    invoke-interface {p1}, Ll/ᩳ֫ܺ;->apply()V

    .line 342
    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    sget v3, Ll/ܿۛ᩸;->֡᩷:I

    .line 1539
    sget-object v3, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v4, "axml_id_2_name"

    .line 0
    invoke-static {v3, v4, p1}, Ll/ۛ۬ܳ;->ۙ(Ll/ۢ֫ܺ;Ljava/lang/String;Z)V

    .line 343
    iget-object p1, v2, Ll/ۡۚ᩸;->ۙ:Ll/᩷ۨᩴ;

    iget-object v2, v2, Ll/ۡۚ᩸;->᩷:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    const v3, 0x7f120774

    const-string v4, "mtcr"

    .line 58
    invoke-static {p2, v3, v4}, Ll/۬֡ܳ;->ۙ(Ll/۠ۨܳ;ILjava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p2

    .line 59
    sget v3, Ll/۬ۜۧ;->ۙ:I

    .line 268
    new-instance v3, Ll/۠ۜۧ;

    const-class v4, Ll/ۢ᩺ۤ;

    invoke-direct {v3, v4}, Ll/۠ۜۧ;-><init>(Ljava/lang/Class;)V

    const-string v4, "saveAsPath"

    .line 60
    invoke-virtual {p2}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, v4, p2}, Ll/۠ۜۧ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "inputPath1"

    .line 61
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p2, p1}, Ll/۠ۜۧ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "inputPath2"

    .line 62
    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p1, p2}, Ll/۠ۜۧ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "id2name"

    .line 63
    invoke-virtual {v3, p1, v0}, Ll/۠ۜۧ;->ۙ(Ljava/lang/String;Z)V

    const-string p1, "ignoreAddOrDel"

    .line 64
    invoke-virtual {v3, p1, v1}, Ll/۠ۜۧ;->ۙ(Ljava/lang/String;Z)V

    .line 65
    invoke-virtual {v3}, Ll/۠ۜۧ;->ۙ()I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
