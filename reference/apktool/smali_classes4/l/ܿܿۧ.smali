.class public final synthetic Ll/ܿܿۧ;
.super Ljava/lang/Object;
.source "31PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ll/ᩳܿۧ;


# direct methods
.method public synthetic constructor <init>(Ll/ᩳܿۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿܿۧ;->ܰ:Ll/ᩳܿۧ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 10

    .line 2
    iget-object p1, p0, Ll/ܿܿۧ;->ܰ:Ll/ᩳܿۧ;

    .line 506
    iget-object p1, p1, Ll/ᩳܿۧ;->ۧ:Ll/ۗ֡ۧ;

    sget v0, Ll/ۗ֡ۧ;->᩹᩷:I

    const v0, 0x7f120099

    .line 721
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f12009a

    .line 722
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f12009b

    .line 723
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f12009c

    .line 724
    invoke-virtual {p1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    .line 726
    new-instance v1, Landroid/text/SpannableString;

    const-string v2, "\n \n"

    const/4 v3, 0x4

    .line 4563
    invoke-static {v3, v2, v0}, Ll/᩺ۨۨ;->ۙ(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 726
    invoke-direct {v1, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v2, v3, :cond_2

    .line 728
    aget-object v5, v0, v2

    const/16 v6, 0xa

    .line 729
    invoke-virtual {v5, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    if-nez v6, :cond_0

    goto :goto_1

    .line 732
    :cond_0
    new-instance v7, Landroid/text/style/ForegroundColorSpan;

    sget v8, Ll/ۗۡ֫;->ۚۙ:I

    invoke-direct {v7, v8}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    add-int/2addr v6, v4

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v8

    add-int/2addr v8, v4

    const/16 v9, 0x11

    invoke-virtual {v1, v7, v6, v8, v9}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 733
    new-instance v7, Landroid/text/style/RelativeSizeSpan;

    const v8, 0x3f59999a    # 0.85f

    invoke-direct {v7, v8}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v8

    add-int/2addr v8, v4

    invoke-virtual {v1, v7, v6, v8, v9}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 734
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x3

    add-int/2addr v5, v4

    .line 735
    invoke-virtual {v1}, Landroid/text/SpannableString;->length()I

    move-result v4

    if-ge v5, v4, :cond_1

    .line 736
    new-instance v4, Landroid/text/style/AbsoluteSizeSpan;

    const/high16 v6, 0x40c00000    # 6.0f

    invoke-static {v6}, Ll/ۜۙܺ;->ۤ(F)I

    move-result v6

    invoke-direct {v4, v6}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    add-int/lit8 v6, v5, -0x3

    invoke-virtual {v1, v4, v6, v5, v9}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :cond_1
    move v4, v5

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 739
    :cond_2
    invoke-virtual {p1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v0

    const v2, 0x7f120451

    .line 740
    invoke-virtual {v0, v2}, Ll/ۖۖۧ;->᩷(I)V

    .line 741
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->ۙ(Ljava/lang/CharSequence;)V

    const v1, 0x7f12018c

    const/4 v2, 0x0

    .line 742
    invoke-virtual {v0, v1, v2}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f1207f2

    .line 743
    invoke-virtual {v0, v1, v2}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 744
    invoke-virtual {v0}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object v0

    .line 745
    invoke-static {v0}, Ll/ۚۙܺ;->ۙ(Ll/۠ۖۧ;)V

    .line 746
    invoke-virtual {v0}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/᩹ܿۧ;

    invoke-direct {v1, p1}, Ll/᩹ܿۧ;-><init>(Ll/ۗ֡ۧ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
