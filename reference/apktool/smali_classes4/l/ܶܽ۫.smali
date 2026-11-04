.class public final synthetic Ll/ܶܽ۫;
.super Ljava/lang/Object;
.source "195F"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:Lbin/mt/plus/Main;

.field public final synthetic ᩶:Ll/᩹ۖ᩸;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;Ll/᩹ۖ᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶܽ۫;->ܰ:Lbin/mt/plus/Main;

    iput-object p2, p0, Ll/ܶܽ۫;->᩶:Ll/᩹ۖ᩸;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .line 461
    new-instance p1, Ljava/util/ArrayList;

    sget v0, Ll/ۖۚۤ;->᩻:I

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const v0, 0x7f120101

    .line 462
    iget-object v1, p0, Ll/ܶܽ۫;->ܰ:Lbin/mt/plus/Main;

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 463
    iget-object v0, p0, Ll/ܶܽ۫;->᩶:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/4 v2, -0x1

    .line 464
    :goto_0
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    .line 465
    :goto_1
    sget v6, Ll/ۖۚۤ;->᩻:I

    if-ge v5, v6, :cond_2

    .line 466
    invoke-static {v5}, Ll/ۖۚۤ;->᩷(I)Ljava/lang/String;

    move-result-object v6

    .line 467
    invoke-virtual {v6, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 468
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 470
    :cond_1
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    new-array v3, v3, [Ljava/lang/String;

    .line 472
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    .line 473
    invoke-virtual {v1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v1

    const v3, 0x7f120874

    .line 474
    invoke-virtual {v1, v3}, Ll/ۖۖۧ;->᩷(I)V

    new-instance v3, Ll/᩺ۚۧ;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v0, p1}, Ll/᩺ۚۧ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 475
    invoke-virtual {v1, p1, v2, v3}, Ll/ۖۖۧ;->ۙ([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12018c

    const/4 v0, 0x0

    .line 479
    invoke-virtual {v1, p1, v0}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 480
    invoke-virtual {v1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void
.end method
