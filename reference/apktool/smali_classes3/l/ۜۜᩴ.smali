.class public final synthetic Ll/ۜۜᩴ;
.super Ljava/lang/Object;
.source "44R4"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ֡:Ljava/util/function/IntConsumer;

.field public final synthetic ۟:Ll/۠ۖۧ;

.field public final synthetic ܰ:Ll/᩹ۖ᩸;

.field public final synthetic ܿ:Ljava/util/function/IntSupplier;

.field public final synthetic ᩶:Landroid/widget/CheckBox;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ۖ᩸;Landroid/widget/CheckBox;Ljava/util/function/IntSupplier;Ljava/util/function/IntConsumer;Ll/۠ۖۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۜᩴ;->ܰ:Ll/᩹ۖ᩸;

    iput-object p2, p0, Ll/ۜۜᩴ;->᩶:Landroid/widget/CheckBox;

    iput-object p3, p0, Ll/ۜۜᩴ;->ܿ:Ljava/util/function/IntSupplier;

    iput-object p4, p0, Ll/ۜۜᩴ;->֡:Ljava/util/function/IntConsumer;

    iput-object p5, p0, Ll/ۜۜᩴ;->۟:Ll/۠ۖۧ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 52
    iget-object p1, p0, Ll/ۜۜᩴ;->ܰ:Ll/᩹ۖ᩸;

    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 53
    iget-object v0, p0, Ll/ۜۜᩴ;->᩶:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x10

    goto :goto_0

    :cond_0
    const/16 v0, 0xa

    :goto_0
    const/4 v1, 0x0

    .line 56
    :try_start_0
    invoke-static {p1, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-ltz p1, :cond_2

    .line 61
    iget-object v0, p0, Ll/ۜۜᩴ;->ܿ:Ljava/util/function/IntSupplier;

    invoke-interface {v0}, Ljava/util/function/IntSupplier;->getAsInt()I

    move-result v0

    if-le p1, v0, :cond_1

    goto :goto_1

    .line 65
    :cond_1
    iget-object v0, p0, Ll/ۜۜᩴ;->֡:Ljava/util/function/IntConsumer;

    invoke-interface {v0, p1}, Ljava/util/function/IntConsumer;->accept(I)V

    .line 66
    iget-object p1, p0, Ll/ۜۜᩴ;->۟:Ll/۠ۖۧ;

    invoke-virtual {p1}, Ll/۠ۖۧ;->dismiss()V

    return-void

    :cond_2
    :goto_1
    const p1, 0x7f120311

    .line 62
    invoke-static {p1, v1}, Ll/᩸۠ۧ;->᩷(II)Ll/᩸۠ۧ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸۠ۧ;->᩷()V

    return-void

    :catch_0
    const p1, 0x7f120d11

    .line 58
    invoke-static {p1, v1}, Ll/᩸۠ۧ;->᩷(II)Ll/᩸۠ۧ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸۠ۧ;->᩷()V

    return-void
.end method
