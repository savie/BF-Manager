.class public final Ll/۬ۜᩴ;
.super Ljava/lang/Object;
.source "44R4"


# static fields
.field public static ۙ:Z = true


# direct methods
.method public static ۙ(Landroid/content/Context;Ljava/util/function/IntSupplier;Ljava/util/function/IntConsumer;)V
    .locals 9

    const v0, 0x7f0d00b9

    const/4 v1, 0x0

    .line 29
    invoke-static {p0, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v2, 0x7f0a0186

    .line 30
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ll/᩹ۖ᩸;

    .line 31
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "0\u2026"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/function/IntSupplier;->getAsInt()I

    move-result v3

    sget-boolean v5, Ll/۬ۜᩴ;->ۙ:Z

    if-eqz v5, :cond_0

    const/16 v5, 0x10

    goto :goto_0

    :cond_0
    const/16 v5, 0xa

    :goto_0
    invoke-static {v3, v5}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ll/᩹ۖ᩸;->᩸(Ljava/lang/String;)V

    const v2, 0x7f0a00e2

    .line 32
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroid/widget/CheckBox;

    .line 33
    sget-boolean v2, Ll/۬ۜᩴ;->ۙ:Z

    invoke-virtual {v5, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 34
    sget v2, Ll/۠ۖۧ;->᩶:I

    .line 192
    new-instance v2, Ll/ۖۖۧ;

    invoke-direct {v2, p0}, Ll/ۖۖۧ;-><init>(Landroid/content/Context;)V

    .line 35
    invoke-virtual {v2, v0}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const p0, 0x7f1208c9

    .line 36
    invoke-virtual {v2, p0, v1}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f120161

    .line 37
    invoke-virtual {v2, p0, v1}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 38
    invoke-virtual {v2}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object v8

    .line 39
    invoke-static {v4}, Ll/᩶᩷ۧ;->᩷(Landroid/view/View;)V

    .line 40
    new-instance p0, Ll/۠ۜᩴ;

    invoke-direct {p0, v4, p1}, Ll/۠ۜᩴ;-><init>(Ll/᩹ۖ᩸;Ljava/util/function/IntSupplier;)V

    invoke-virtual {v5, p0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 51
    invoke-virtual {v8}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object p0

    new-instance v0, Ll/ۜۜᩴ;

    move-object v3, v0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v3 .. v8}, Ll/ۜۜᩴ;-><init>(Ll/᩹ۖ᩸;Landroid/widget/CheckBox;Ljava/util/function/IntSupplier;Ljava/util/function/IntConsumer;Ll/۠ۖۧ;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/᩹ۖ᩸;Ljava/util/function/IntSupplier;Z)V
    .locals 3

    .line 41
    sput-boolean p2, Ll/۬ۜᩴ;->ۙ:Z

    const/16 v0, 0x10

    .line 43
    :try_start_0
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz p2, :cond_0

    const/16 v2, 0xa

    goto :goto_0

    :cond_0
    const/16 v2, 0x10

    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    if-eqz p2, :cond_1

    const/16 v2, 0x10

    goto :goto_1

    :cond_1
    const/16 v2, 0xa

    .line 44
    :goto_1
    invoke-static {v1, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 45
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v1

    invoke-virtual {p0, v1}, Ll/᩹ۖ᩸;->᩹(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    nop

    .line 49
    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "0\u2026"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/function/IntSupplier;->getAsInt()I

    move-result p1

    if-eqz p2, :cond_2

    goto :goto_3

    :cond_2
    const/16 v0, 0xa

    :goto_3
    invoke-static {p1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩹ۖ᩸;->᩸(Ljava/lang/String;)V

    return-void
.end method
