.class public final synthetic Ll/ۧۗ۫;
.super Ljava/lang/Object;
.source "5AG9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ll/᩹ۖ᩸;

.field public final synthetic ᩶:Ll/ܽ֡֫;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ۖ᩸;Ll/ܽ֡֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧۗ۫;->ܰ:Ll/᩹ۖ᩸;

    iput-object p2, p0, Ll/ۧۗ۫;->᩶:Ll/ܽ֡֫;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 472
    iget-object p1, p0, Ll/ۧۗ۫;->ܰ:Ll/᩹ۖ᩸;

    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 473
    new-instance v1, Ljava/util/ArrayList;

    sget v2, Ll/ۖۚۤ;->᩻:I

    add-int/lit8 v2, v2, -0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 474
    :goto_0
    sget v5, Ll/ۖۚۤ;->᩻:I

    if-ge v4, v5, :cond_2

    .line 475
    invoke-static {v4}, Ll/ۖۚۤ;->᩷(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "UTF-8-BOM"

    .line 476
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    .line 479
    :cond_0
    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 480
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 482
    :cond_1
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    new-array v0, v3, [Ljava/lang/String;

    .line 484
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 485
    iget-object v1, p0, Ll/ۧۗ۫;->᩶:Ll/ܽ֡֫;

    invoke-virtual {v1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v1

    const v3, 0x7f120874

    .line 486
    invoke-virtual {v1, v3}, Ll/ۖۖۧ;->᩷(I)V

    new-instance v3, Ll/᩻ۗ۫;

    invoke-direct {v3, p1, v0}, Ll/᩻ۗ۫;-><init>(Ll/᩹ۖ᩸;[Ljava/lang/String;)V

    .line 487
    invoke-virtual {v1, v0, v2, v3}, Ll/ۖۖۧ;->ۙ([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12018c

    const/4 v0, 0x0

    .line 491
    invoke-virtual {v1, p1, v0}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 492
    invoke-virtual {v1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void
.end method
