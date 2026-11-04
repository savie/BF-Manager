.class public Ll/ܿۛ᩸;
.super Ll/ܽ֡֫;
.source "75NJ"


# static fields
.field public static final synthetic ֡᩷:I

.field public static final ۟᩷:Ljava/lang/Object;

.field public static final ᩳ᩷:Ljava/lang/Object;


# instance fields
.field public ֫᩷:Ll/᩻֫ܺ;

.field public ۗ᩷:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

.field public ۘ᩷:Ll/۠᩶᩻;

.field public ۚ᩷:Ll/ܶ᩹;

.field public ۛ᩷:Ll/۬֨ᩴ;

.field public ۧ᩷:Z

.field public ۨ᩷:Z

.field public ۫᩷:Ll/۟᩷ۙ;

.field public ܰ᩷:Ll/ۨۧۧ;

.field public ܳ᩷:Z

.field public ܶ᩷:Ll/ۨ֡᩷;

.field public ܺ᩷:Ll/۬ۨ᩸;

.field public ܽ᩷:Z

.field public final ܿ᩷:Ll/ۗۤۧ;

.field public ᩴ᩷:I

.field public ᩵᩷:Ll/᩻ᩳ᩷;

.field public ᩶᩷:Ll/֨ܰ᩸;

.field public ᩸᩷:Ll/ۗۛ᩸;

.field public ᩹᩷:Ll/᩹۫ۧ;

.field public ᩺᩷:Z

.field public ᩻᩷:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 98
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܿۛ᩸;->۟᩷:Ljava/lang/Object;

    .line 99
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܿۛ᩸;->ᩳ᩷:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 96
    invoke-direct {p0}, Ll/ܽ֡֫;-><init>()V

    .line 102
    new-instance v0, Ll/ۡܺܺ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ll/ۡܺܺ;-><init>(ILjava/lang/Object;)V

    .line 824
    invoke-static {p0, v0}, Ll/ۨۤۧ;->ۙ(Ll/ۚۤ;Ll/ܶۤۧ;)Ll/ۗۤۧ;

    move-result-object v0

    .line 102
    iput-object v0, p0, Ll/ܿۛ᩸;->ܿ᩷:Ll/ۗۤۧ;

    .line 127
    new-instance v0, Ll/۬ۨ᩸;

    invoke-direct {v0, p0}, Ll/۬ۨ᩸;-><init>(Ll/ܿۛ᩸;)V

    iput-object v0, p0, Ll/ܿۛ᩸;->ܺ᩷:Ll/۬ۨ᩸;

    .line 139
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 140
    iput v0, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    const/4 v0, 0x0

    .line 142
    iput-boolean v0, p0, Ll/ܿۛ᩸;->ܳ᩷:Z

    .line 503
    invoke-static {}, Ll/᩻֫ܺ;->ܳ()Ll/᩻֫ܺ;

    move-result-object v1

    iput-object v1, p0, Ll/ܿۛ᩸;->֫᩷:Ll/᩻֫ܺ;

    .line 532
    iput-boolean v0, p0, Ll/ܿۛ᩸;->ۨ᩷:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܿۛ᩸;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܿۛ᩸;->᩺᩷:Z

    return p0
.end method

.method private ֫ۙ()V
    .locals 6

    .line 1310
    new-instance v0, Ll/ۛۚۤ;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ll/ۛۚۤ;-><init>(I)V

    .line 1311
    iget v1, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    invoke-virtual {v0, v1}, Ll/ۛۚۤ;->writeInt(I)V

    .line 1312
    new-instance v1, Ll/۟᩶᩸;

    invoke-static {}, Ll/᩶ۨ᩸;->᩷()Ll/᩷ۨᩴ;

    move-result-object v2

    sget-object v3, Ll/ܿۛ᩸;->ᩳ᩷:Ljava/lang/Object;

    invoke-direct {v1, v2, v0, v3}, Ll/۟᩶᩸;-><init>(Ll/᩷ۨᩴ;Ll/ۛۚۤ;Ljava/lang/Object;)V

    const-wide/16 v4, 0xc8

    invoke-static {v1, v3, v4, v5}, Ll/ۙ᩻ܺ;->ۙ(Ljava/lang/Runnable;Ljava/lang/Object;J)V

    return-void
.end method

.method public static ۙ(Ljava/lang/CharSequence;)V
    .locals 0

    .line 450
    sput-object p0, Ll/᩻᩶᩸;->᩷:Ljava/lang/CharSequence;

    return-void
.end method

.method public static synthetic ۙ(Ll/ܿۛ᩸;)V
    .locals 3

    .line 182
    iget-object v0, p0, Ll/ܿۛ᩸;->۫᩷:Ll/۟᩷ۙ;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 183
    iget-object v1, p0, Ll/ܿۛ᩸;->۫᩷:Ll/۟᩷ۙ;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    sub-int/2addr v1, v0

    iget-object v0, p0, Ll/ܿۛ᩸;->ۗ᩷:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    sub-int/2addr v1, v0

    const/high16 v0, 0x42100000    # 36.0f

    .line 184
    invoke-static {v0}, Ll/ۜۙܺ;->ۙ(F)I

    move-result v0

    mul-int/lit8 v2, v0, 0x2

    if-le v1, v2, :cond_0

    sub-int/2addr v1, v0

    goto :goto_0

    .line 189
    :cond_0
    div-int/lit8 v1, v1, 0x2

    :goto_0
    neg-int v0, v1

    .line 191
    iget-object v1, p0, Ll/ܿۛ᩸;->ۗ᩷:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v1}, Landroid/view/View;->getTranslationX()F

    move-result v1

    int-to-float v0, v0

    cmpl-float v1, v1, v0

    if-eqz v1, :cond_1

    .line 192
    iget-object p0, p0, Ll/ܿۛ᩸;->ۗ᩷:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {p0, v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setTranslationX(F)V

    :cond_1
    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ܿۛ᩸;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    return-void
.end method

.method public static ۙ(Ll/ܿۛ᩸;ILandroid/content/Intent;)V
    .locals 2

    const/4 v0, -0x1

    if-ne p1, v0, :cond_4

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "preview_editor_state"

    .line 106
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    .line 108
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_4

    const/4 p1, 0x0

    .line 295
    invoke-direct {p0, p2, p1, p1}, Ll/ܿۛ᩸;->ۙ(Landroid/content/Intent;ZZ)Z

    return-void

    .line 111
    :cond_1
    iget-object p2, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟ܰ᩸;

    .line 112
    invoke-virtual {v0}, Ll/ۜܽ᩸;->۫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 113
    invoke-virtual {p0, v0}, Ll/ܿۛ᩸;->᩷(Ll/۟ܰ᩸;)V

    return-void

    :cond_3
    const p0, 0x7f1208d0

    .line 117
    invoke-static {p0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    :cond_4
    :goto_0
    return-void
.end method

.method public static synthetic ۙ(Ll/ܿۛ᩸;ILandroid/widget/CheckBox;)V
    .locals 4

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    const/4 v2, 0x1

    add-int/2addr p1, v2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v1, p1, v3}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 851
    new-instance p1, Ll/ۜۨ᩸;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, p1}, Ll/ۢۚܺ;->ۙ(Ljava/util/List;Ljava/util/function/Predicate;)V

    .line 852
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    .line 853
    new-instance p2, Ljava/util/LinkedList;

    invoke-direct {p2}, Ljava/util/LinkedList;-><init>()V

    .line 854
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ܰ᩸;

    .line 855
    new-instance v3, Ll/᩺ۛ᩸;

    invoke-direct {v3, p0, p2, v1, p1}, Ll/᩺ۛ᩸;-><init>(Ll/ܿۛ᩸;Ljava/util/LinkedList;Ll/۟ܰ᩸;Z)V

    invoke-virtual {p2, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 857
    :cond_0
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 858
    iput-boolean v2, p0, Ll/ܿۛ᩸;->ܳ᩷:Z

    .line 859
    invoke-virtual {p2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩺ۛ᩸;

    invoke-virtual {p0}, Ll/᩺ۛ᩸;->ۙ()V

    :cond_1
    return-void
.end method

.method public static ۙ(Ll/ܿۛ᩸;Landroid/content/Intent;Z)V
    .locals 3

    .line 409
    iget-object v0, p0, Ll/ܿۛ᩸;->ۛ᩷:Ll/۬֨ᩴ;

    if-eqz v0, :cond_0

    .line 410
    invoke-virtual {v0}, Ll/۬֨ᩴ;->ۙ()V

    const/4 v0, 0x0

    .line 411
    iput-object v0, p0, Ll/ܿۛ᩸;->ۛ᩷:Ll/۬֨ᩴ;

    :cond_0
    const/4 v0, 0x0

    .line 413
    iput-boolean v0, p0, Ll/ܿۛ᩸;->ܽ᩷:Z

    .line 430
    invoke-virtual {p0}, Ll/ۗ۫ۙ;->᩹()Ll/ۗۚۙ;

    move-result-object v1

    .line 431
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v2

    if-nez v2, :cond_1

    .line 432
    invoke-virtual {v1}, Ll/ۗۚۙ;->ᩳ()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Ll/ۗۚۙ;->۟()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    .line 417
    invoke-direct {p0, p1, v1, v0}, Ll/ܿۛ᩸;->ۙ(Landroid/content/Intent;ZZ)Z

    if-eqz p2, :cond_1

    .line 439
    iget p1, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    .line 442
    invoke-direct {p0}, Ll/ܿۛ᩸;->ۚۙ()I

    move-result p1

    if-eq p1, p2, :cond_1

    .line 1126
    invoke-direct {p0, p1, v0}, Ll/ܿۛ᩸;->ۤ(IZ)V

    :cond_1
    return-void
.end method

.method public static synthetic ۙ(Ll/ܿۛ᩸;Landroid/widget/CheckBox;)V
    .locals 4

    .line 770
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 771
    new-instance v1, Ll/ۜۨ᩸;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Ll/ۢۚܺ;->ۙ(Ljava/util/List;Ljava/util/function/Predicate;)V

    .line 772
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    .line 773
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 774
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟ܰ᩸;

    .line 775
    new-instance v3, Ll/᩺ۛ᩸;

    invoke-direct {v3, p0, v1, v2, p1}, Ll/᩺ۛ᩸;-><init>(Ll/ܿۛ᩸;Ljava/util/LinkedList;Ll/۟ܰ᩸;Z)V

    invoke-virtual {v1, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 777
    :cond_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 778
    iput-boolean p1, p0, Ll/ܿۛ᩸;->ܳ᩷:Z

    .line 779
    invoke-virtual {v1}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩺ۛ᩸;

    invoke-virtual {p0}, Ll/᩺ۛ᩸;->ۙ()V

    :cond_1
    return-void
.end method

.method public static ۙ(Ll/ܿۛ᩸;Ll/ۢۚ;I)V
    .locals 6

    .line 712
    iget-object v0, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    new-instance v1, Ll/ۘۛ᩸;

    .line 871
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 713
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_4

    .line 714
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۟ܰ᩸;

    .line 715
    invoke-virtual {v4}, Ll/ۜܽ᩸;->ۧ()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    .line 718
    :cond_0
    invoke-static {v1}, Ll/ۘۛ᩸;->᩷(Ll/ۘۛ᩸;)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-static {v1, v5}, Ll/ۘۛ᩸;->᩷(Ll/ۘۛ᩸;I)V

    .line 719
    invoke-virtual {v4}, Ll/ۜܽ᩸;->ۚ()Z

    move-result v4

    if-nez v4, :cond_1

    .line 720
    invoke-static {v1}, Ll/ۘۛ᩸;->᩸(Ll/ۘۛ᩸;)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-static {v1, v4}, Ll/ۘۛ᩸;->᩸(Ll/ۘۛ᩸;I)V

    :cond_1
    if-ge v3, p2, :cond_2

    .line 723
    invoke-static {v1}, Ll/ۘۛ᩸;->ۙ(Ll/ۘۛ᩸;)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-static {v1, v4}, Ll/ۘۛ᩸;->ۙ(Ll/ۘۛ᩸;I)V

    goto :goto_1

    :cond_2
    if-le v3, p2, :cond_3

    .line 725
    invoke-static {v1}, Ll/ۘۛ᩸;->ۤ(Ll/ۘۛ᩸;)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-static {v1, v4}, Ll/ۘۛ᩸;->ۤ(Ll/ۘۛ᩸;I)V

    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 689
    :cond_4
    invoke-static {v1}, Ll/ۘۛ᩸;->ᩴ(Ll/ۘۛ᩸;)Z

    move-result p2

    if-nez p2, :cond_5

    return-void

    .line 692
    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x7f12018c

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\u2026"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const p2, 0x7f0a03a8

    invoke-interface {p1, v2, p2, v2, p0}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object p0

    .line 693
    invoke-interface {p0}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    move-result-object p1

    const p2, 0x7f0801fa

    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const p1, 0x7f12098d

    .line 694
    invoke-interface {p0, p1}, Landroid/view/SubMenu;->setHeaderTitle(I)Landroid/view/SubMenu;

    const p1, 0x7f0a03ac

    const p2, 0x7f120995

    .line 695
    invoke-interface {p0, v2, p1, v2, p2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    invoke-static {v1}, Ll/ۘۛ᩸;->ۙ(Ll/ۘۛ᩸;)I

    move-result p2

    invoke-static {v1}, Ll/ۘۛ᩸;->ۤ(Ll/ۘۛ᩸;)I

    move-result v0

    add-int/2addr p2, v0

    if-lez p2, :cond_6

    const/4 p2, 0x1

    goto :goto_2

    :cond_6
    const/4 p2, 0x0

    .line 696
    :goto_2
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const p1, 0x7f0a03aa

    const p2, 0x7f120990

    .line 697
    invoke-interface {p0, v2, p1, v2, p2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    invoke-static {v1}, Ll/ۘۛ᩸;->᩷(Ll/ۘۛ᩸;)I

    move-result p2

    if-lez p2, :cond_7

    const/4 p2, 0x1

    goto :goto_3

    :cond_7
    const/4 p2, 0x0

    .line 698
    :goto_3
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const p1, 0x7f0a03ad

    const p2, 0x7f120997

    .line 699
    invoke-interface {p0, v2, p1, v2, p2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    invoke-static {v1}, Ll/ۘۛ᩸;->᩸(Ll/ۘۛ᩸;)I

    move-result p2

    if-lez p2, :cond_8

    const/4 p2, 0x1

    goto :goto_4

    :cond_8
    const/4 p2, 0x0

    .line 700
    :goto_4
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const p1, 0x7f0a03a9

    const p2, 0x7f12098e

    .line 701
    invoke-interface {p0, v2, p1, v2, p2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    invoke-static {v1}, Ll/ۘۛ᩸;->ۙ(Ll/ۘۛ᩸;)I

    move-result p2

    if-lez p2, :cond_9

    const/4 p2, 0x1

    goto :goto_5

    :cond_9
    const/4 p2, 0x0

    .line 702
    :goto_5
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const p1, 0x7f0a03ab

    const p2, 0x7f120992

    .line 703
    invoke-interface {p0, v2, p1, v2, p2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p0

    invoke-static {v1}, Ll/ۘۛ᩸;->ۤ(Ll/ۘۛ᩸;)I

    move-result p1

    if-lez p1, :cond_a

    const/4 v2, 0x1

    .line 704
    :cond_a
    invoke-interface {p0, v2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    return-void
.end method

.method private ۙ(Landroid/content/Intent;ZZ)Z
    .locals 8

    const-string v0, "fromExternalApp"

    const/4 v1, 0x0

    .line 303
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 304
    iput-boolean v2, p0, Ll/ܿۛ᩸;->ۧ᩷:Z

    :cond_0
    const-string v0, "bin.mt.edit2.ACTION_CREATE_WITH_TEXT"

    .line 306
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 307
    invoke-virtual {p0}, Ll/ܿۛ᩸;->᩷ۙ()V

    return v1

    :cond_1
    const-string v0, "android.intent.action.SEND"

    .line 310
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "android.intent.extra.TEXT"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 311
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 450
    sput-object v0, Ll/᩻᩶᩸;->᩷:Ljava/lang/CharSequence;

    .line 314
    invoke-virtual {p0}, Ll/ܿۛ᩸;->᩷ۙ()V

    return v1

    :cond_2
    const-string v0, "android.intent.action.VIEW"

    .line 318
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v3, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    if-nez v0, :cond_3

    const-string v0, "android.intent.action.EDIT"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 319
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_e

    .line 320
    invoke-virtual {p0}, Ll/ܿۛ᩸;->᩷ۙ()V

    return v1

    .line 324
    :cond_3
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_4

    .line 325
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_e

    .line 326
    invoke-virtual {p0}, Ll/ܿۛ᩸;->᩷ۙ()V

    return v1

    :cond_4
    if-nez p2, :cond_5

    .line 330
    invoke-static {}, Ll/۟۠ۧ;->۫()Z

    move-result p2

    if-nez p2, :cond_5

    .line 398
    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 399
    iput-boolean v2, p0, Ll/ܿۛ᩸;->ܽ᩷:Z

    .line 400
    new-instance p1, Ll/۬֨ᩴ;

    const v0, 0x7f12057b

    invoke-direct {p1, p0, v0}, Ll/۬֨ᩴ;-><init>(Ll/ܽ֡֫;I)V

    const/16 v0, 0x1f4

    invoke-virtual {p1, v0}, Ll/۬֨ᩴ;->ۤ(I)V

    iput-object p1, p0, Ll/ܿۛ᩸;->ۛ᩷:Ll/۬֨ᩴ;

    .line 401
    sget-object p1, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ll/۫ۛ᩸;

    invoke-direct {v0, p0, p2, p3}, Ll/۫ۛ᩸;-><init>(Ll/ܿۛ᩸;Landroid/content/Intent;Z)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return v2

    .line 335
    :cond_5
    :try_start_0
    invoke-static {p1}, Ll/ܰۨᩴ;->ۙ(Landroid/content/Intent;)Ll/᩷ۨᩴ;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 342
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result p3

    const/4 v0, 0x0

    :goto_0
    const/4 v4, 0x0

    if-ge v0, p3, :cond_7

    .line 343
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۟ܰ᩸;

    .line 344
    invoke-virtual {v5}, Ll/ۜܽ᩸;->ۤ()Ll/ۡܰ᩸;

    move-result-object v6

    .line 63
    iget-object v6, v6, Ll/ۡܰ᩸;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v6}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v6

    .line 344
    invoke-virtual {p2}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_1

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_7
    const/4 v0, -0x1

    move-object v5, v4

    :goto_1
    if-nez v5, :cond_d

    .line 352
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result p3

    if-ne p3, v2, :cond_8

    .line 353
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/۟ܰ᩸;

    .line 354
    invoke-virtual {p3}, Ll/ۜܽ᩸;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p3}, Ll/ۜܽ᩸;->ۚ()Z

    move-result p3

    if-nez p3, :cond_8

    const/4 p3, 0x1

    goto :goto_2

    :cond_8
    const/4 p3, 0x0

    .line 359
    :goto_2
    new-instance v0, Ll/۟ܰ᩸;

    invoke-direct {v0}, Ll/۟ܰ᩸;-><init>()V

    .line 360
    invoke-virtual {v0, v4}, Ll/ۜܽ᩸;->᩷(Ljava/lang/String;)V

    const-string v4, "filePath"

    .line 361
    invoke-virtual {p2}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p2

    iget-object v5, v0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    invoke-virtual {v5, v4, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    invoke-static {}, Ll/ܽܶ᩸;->᩸()Ll/ܽܶ᩸;

    move-result-object p2

    sget-object v4, Ll/ܽܶ᩸;->᩶:Ll/ܽܶ᩸;

    if-eq p2, v4, :cond_9

    const-string p2, "temp"

    .line 363
    invoke-virtual {v5, p2, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_9
    const-string p2, "save_as_path"

    .line 366
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_a

    .line 368
    invoke-virtual {v5, p2, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_a
    const-string p2, "axml"

    .line 370
    invoke-virtual {p1, p2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_b

    const-string p2, "forceTryAXml"

    .line 371
    invoke-virtual {v5, p2, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_b
    const-string p2, "class"

    .line 373
    invoke-virtual {p1, p2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_c

    const-string p1, "forceTryClass"

    .line 374
    invoke-virtual {v5, p1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 376
    :cond_c
    invoke-direct {p0}, Ll/ܿۛ᩸;->ۚۙ()I

    move-result p1

    add-int/2addr p1, v2

    invoke-direct {p0, p1, v1}, Ll/ܿۛ᩸;->᩷(IZ)I

    move-result p1

    .line 377
    invoke-virtual {v3, p1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 378
    invoke-direct {p0}, Ll/ܿۛ᩸;->᩻ۙ()V

    new-array p2, v1, [Ljava/lang/String;

    .line 352
    invoke-virtual {v0, p2}, Ll/۟ܰ᩸;->ۙ([Ljava/lang/String;)V

    move v0, p1

    goto :goto_3

    :cond_d
    const/4 p3, 0x0

    .line 1126
    :goto_3
    invoke-direct {p0, v0, v1}, Ll/ܿۛ᩸;->ۤ(IZ)V

    if-eqz p3, :cond_e

    .line 389
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟ܰ᩸;

    invoke-virtual {p0, p1}, Ll/ܿۛ᩸;->ۙ(Ll/۟ܰ᩸;)V

    :cond_e
    return v1

    :catch_0
    move-exception p1

    .line 337
    invoke-virtual {p0, p1, v2}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Z)V

    return v1
.end method

.method public static bridge synthetic ۚ(Ll/ܿۛ᩸;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۛ᩸;->ۗ᩷:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    return-object p0
.end method

.method private ۚ(I)Ljava/lang/String;
    .locals 2

    if-ltz p1, :cond_1

    .line 677
    iget-object v0, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt p1, v1, :cond_0

    goto :goto_0

    .line 680
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟ܰ᩸;

    invoke-virtual {p1}, Ll/ۜܽ᩸;->ۤ()Ll/ۡܰ᩸;

    move-result-object p1

    .line 58
    iget-object p1, p1, Ll/ۡܰ᩸;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {p1}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x32

    .line 681
    invoke-static {v0, p1}, Ll/ᩳۡܶ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private ۚۙ()I
    .locals 4

    const/4 v0, -0x1

    .line 1321
    :try_start_0
    invoke-static {}, Ll/᩶ۨ᩸;->᩷()Ll/᩷ۨᩴ;

    move-result-object v1

    .line 1322
    sget-object v2, Ll/ܿۛ᩸;->ᩳ᩷:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 1323
    :try_start_1
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->֨()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1324
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ۗ᩷()Ll/᩵ۚۤ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩵ۚۤ;->readInt()I

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    .line 1326
    :goto_0
    :try_start_2
    monitor-exit v2

    goto :goto_3

    :catchall_0
    move-exception v3

    goto :goto_1

    :catchall_1
    move-exception v1

    const/4 v3, -0x1

    move-object v3, v1

    const/4 v1, -0x1

    :goto_1
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception v2

    goto :goto_2

    :catch_1
    move-exception v1

    move-object v2, v1

    const/4 v1, -0x1

    .line 1328
    :goto_2
    iget-object v3, p0, Ll/ܿۛ᩸;->᩶᩷:Ll/֨ܰ᩸;

    invoke-virtual {v3, v2}, Ll/֨ܰ᩸;->ۙ(Ljava/lang/Throwable;)V

    .line 1330
    :goto_3
    iget-object v2, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_5

    :cond_1
    if-ltz v1, :cond_3

    .line 1332
    iget-object v0, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v1, v0, :cond_2

    goto :goto_4

    :cond_2
    move v0, v1

    goto :goto_5

    :cond_3
    :goto_4
    const/4 v0, 0x0

    :goto_5
    return v0
.end method

.method private ۤ(IZ)V
    .locals 6

    if-ltz p1, :cond_8

    .line 1131
    iget-object v0, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_8

    .line 1134
    invoke-virtual {p0}, Ll/ۗ۫ۙ;->᩹()Ll/ۗۚۙ;

    move-result-object v1

    .line 1135
    invoke-virtual {v1}, Ll/ۗۚۙ;->ᩳ()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {v1}, Ll/ۗۚۙ;->۟()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_3

    .line 1138
    :cond_0
    iget v2, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    .line 1140
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۟ܰ᩸;

    .line 1141
    invoke-virtual {v1}, Ll/ۗۚۙ;->᩷()Ll/ۙ֫ۙ;

    move-result-object v0

    invoke-virtual {p2}, Ll/ۜܽ᩸;->۫()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f0a0117

    invoke-virtual {v0, v2, p2, v1}, Ll/ۙ֫ۙ;->ۙ(ILl/ۧ۫ۙ;Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ۙ֫ۙ;->᩷()I

    .line 1142
    iput p1, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    .line 1143
    invoke-direct {p0}, Ll/ܿۛ᩸;->֫ۙ()V

    .line 1144
    invoke-direct {p0}, Ll/ܿۛ᩸;->ܽۙ()V

    .line 1145
    iget-object p1, p0, Ll/ܿۛ᩸;->᩸᩷:Ll/ۗۛ᩸;

    invoke-virtual {p1}, Ll/۫۟᩷;->notifyDataSetChanged()V

    return-void

    :cond_1
    if-eq v2, p1, :cond_6

    .line 1147
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟ܰ᩸;

    .line 1148
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟ܰ᩸;

    if-nez p2, :cond_3

    .line 1150
    invoke-virtual {v2}, Ll/۟ܰ᩸;->ۘ()Ll/ᩴۧۧ;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 1152
    iget-object v3, p0, Ll/ܿۛ᩸;->ܰ᩷:Ll/ۨۧۧ;

    invoke-virtual {v3}, Ll/ۨۧۧ;->᩸()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1153
    iget-object v3, p0, Ll/ܿۛ᩸;->ܰ᩷:Ll/ۨۧۧ;

    new-instance v4, Ll/ܳۛ᩸;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p2}, Ll/ܳۛ᩸;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v3, v4}, Ll/ۨۧۧ;->ۙ(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 1158
    :cond_2
    invoke-interface {p2}, Ll/ᩴۧۧ;->᩷()V

    .line 1159
    iget-object v3, p0, Ll/ܿۛ᩸;->ܰ᩷:Ll/ۨۧۧ;

    new-instance v4, Ll/ۙۛ᩸;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p2}, Ll/ۙۛ᩸;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v3, v4}, Ll/ۨۧۧ;->ۙ(Ljava/lang/Runnable;)V

    .line 1163
    :cond_3
    :goto_0
    invoke-virtual {v1}, Ll/ۗۚۙ;->᩷()Ll/ۙ֫ۙ;

    move-result-object p2

    .line 1164
    iget v1, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    if-ge v1, p1, :cond_4

    const v1, 0x7f01003d

    const v3, 0x7f01003c

    .line 1165
    invoke-virtual {p2, v1, v3}, Ll/ۙ֫ۙ;->ۙ(II)V

    goto :goto_1

    :cond_4
    const v1, 0x7f01003b

    const v3, 0x7f01003e

    .line 1167
    invoke-virtual {p2, v1, v3}, Ll/ۙ֫ۙ;->ۙ(II)V

    .line 1169
    :goto_1
    invoke-virtual {p2, v2}, Ll/ۙ֫ۙ;->᩷(Ll/ۧ۫ۙ;)Ll/ۙ֫ۙ;

    .line 1170
    invoke-virtual {v0}, Ll/ۧ۫ۙ;->isDetached()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 1171
    invoke-virtual {p2, v0}, Ll/ۙ֫ۙ;->ۙ(Ll/ۧ۫ۙ;)V

    goto :goto_2

    .line 1173
    :cond_5
    invoke-virtual {v0}, Ll/ۜܽ᩸;->۫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Ll/ۙ֫ۙ;->ۙ(Ll/ۧ۫ۙ;Ljava/lang/String;)V

    .line 1175
    :goto_2
    invoke-virtual {p2}, Ll/ۙ֫ۙ;->ۤ()I

    .line 1176
    iput p1, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    .line 1177
    invoke-direct {p0}, Ll/ܿۛ᩸;->֫ۙ()V

    .line 1178
    invoke-direct {p0}, Ll/ܿۛ᩸;->ܽۙ()V

    .line 1179
    iget-object p1, p0, Ll/ܿۛ᩸;->᩸᩷:Ll/ۗۛ᩸;

    invoke-virtual {p1}, Ll/۫۟᩷;->notifyDataSetChanged()V

    return-void

    .line 1181
    :cond_6
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟ܰ᩸;

    invoke-virtual {p1}, Ll/۟ܰ᩸;->ܿ()V

    :cond_7
    :goto_3
    return-void

    .line 1132
    :cond_8
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public static synthetic ۤ(Ll/ܿۛ᩸;)V
    .locals 1

    .line 961
    iget-object v0, p0, Ll/ܿۛ᩸;->᩵᩷:Ll/᩻ᩳ᩷;

    iget p0, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    invoke-virtual {v0, p0}, Ll/᩻ᩳ᩷;->smoothScrollToPosition(I)V

    return-void
.end method

.method public static ۤ(Ll/ܿۛ᩸;I)V
    .locals 6

    .line 1503
    iget-object v0, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    const/4 v1, -0x1

    if-eq p1, v1, :cond_5

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt p1, v1, :cond_0

    goto :goto_1

    .line 1507
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ܰ᩸;

    .line 1508
    invoke-virtual {v1}, Ll/ۜܽ᩸;->ۧ()Z

    move-result v2

    const-string v3, "top"

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    .line 1509
    invoke-direct {p0, v4, v4}, Ll/ܿۛ᩸;->᩷(IZ)I

    move-result v2

    .line 109
    invoke-virtual {v1}, Ll/ۧ۫ۙ;->requireArguments()Landroid/os/Bundle;

    move-result-object v5

    invoke-static {v5}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v3, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1511
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟ܰ᩸;

    invoke-virtual {v3}, Ll/ۜܽ᩸;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    .line 1515
    invoke-direct {p0, v4, v2}, Ll/ܿۛ᩸;->᩷(IZ)I

    move-result v4

    .line 109
    invoke-virtual {v1}, Ll/ۧ۫ۙ;->requireArguments()Landroid/os/Bundle;

    move-result-object v5

    invoke-static {v5}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v3, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1517
    invoke-virtual {v1}, Ll/۟ܰ᩸;->֡()V

    move v2, v4

    :cond_2
    if-eq p1, v2, :cond_4

    .line 1520
    iget v3, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟ܰ᩸;

    if-ge p1, v2, :cond_3

    add-int/lit8 v2, v2, -0x1

    .line 1524
    :cond_3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1525
    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1526
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    .line 1527
    invoke-direct {p0}, Ll/ܿۛ᩸;->֫ۙ()V

    .line 1528
    invoke-direct {p0}, Ll/ܿۛ᩸;->ܽۙ()V

    .line 1530
    :cond_4
    invoke-direct {p0}, Ll/ܿۛ᩸;->᩻ۙ()V

    .line 1531
    iget-object p0, p0, Ll/ܿۛ᩸;->᩸᩷:Ll/ۗۛ᩸;

    invoke-virtual {p0}, Ll/۫۟᩷;->notifyDataSetChanged()V

    :cond_5
    :goto_1
    return-void
.end method

.method public static synthetic ۤ(Ll/ܿۛ᩸;ILandroid/widget/CheckBox;)V
    .locals 3

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 746
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 747
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 748
    new-instance p1, Ll/ۜۨ᩸;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, p1}, Ll/ۢۚܺ;->ۙ(Ljava/util/List;Ljava/util/function/Predicate;)V

    .line 749
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    .line 750
    new-instance p2, Ljava/util/LinkedList;

    invoke-direct {p2}, Ljava/util/LinkedList;-><init>()V

    .line 751
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ܰ᩸;

    .line 752
    new-instance v2, Ll/᩺ۛ᩸;

    invoke-direct {v2, p0, p2, v1, p1}, Ll/᩺ۛ᩸;-><init>(Ll/ܿۛ᩸;Ljava/util/LinkedList;Ll/۟ܰ᩸;Z)V

    invoke-virtual {p2, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 754
    :cond_0
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 755
    iput-boolean p1, p0, Ll/ܿۛ᩸;->ܳ᩷:Z

    .line 756
    invoke-virtual {p2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩺ۛ᩸;

    invoke-virtual {p0}, Ll/᩺ۛ᩸;->ۙ()V

    :cond_1
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܿۛ᩸;)Ll/۠᩶᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۛ᩸;->ۘ᩷:Ll/۠᩶᩻;

    return-object p0
.end method

.method private ۧۙ()V
    .locals 4

    .line 1299
    iget v0, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 1300
    iget v0, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟ܰ᩸;

    .line 1301
    invoke-virtual {v0}, Ll/۟ܰ᩸;->ۘ()Ll/ᩴۧۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1303
    invoke-interface {v0}, Ll/ᩴۧۧ;->᩷()V

    .line 1304
    iget-object v1, p0, Ll/ܿۛ᩸;->ܰ᩷:Ll/ۨۧۧ;

    new-instance v2, Ll/ۙۛ᩸;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0}, Ll/ۙۛ᩸;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Ll/ۨۧۧ;->ۙ(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۫(Ll/ܿۛ᩸;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static ۫ۙ()Z
    .locals 3

    .line 1535
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v1, "axml_id_2_name"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static bridge synthetic ܳ(Ll/ܿۛ᩸;)Ll/۟᩷ۙ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۛ᩸;->۫᩷:Ll/۟᩷ۙ;

    return-object p0
.end method

.method public static bridge synthetic ܶ(Ll/ܿۛ᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܿۛ᩸;->᩻ۙ()V

    return-void
.end method

.method public static bridge synthetic ܺ(Ll/ܿۛ᩸;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-boolean v0, p0, Ll/ܿۛ᩸;->ܳ᩷:Z

    return-void
.end method

.method private ܺۙ()V
    .locals 3

    .line 277
    invoke-virtual {p0}, Ll/ۘᩴ;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    .line 278
    invoke-virtual {p0}, Ll/ܽ֡֫;->ᩳ()Ll/ᩳۜ;

    move-result-object v0

    invoke-virtual {v0, v2}, Ll/ᩳۜ;->ۙ(I)V

    return-void

    .line 279
    :cond_0
    invoke-virtual {p0}, Ll/ۘᩴ;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    if-ne v0, v2, :cond_1

    .line 280
    invoke-virtual {p0}, Ll/ܽ֡֫;->ᩳ()Ll/ᩳۜ;

    move-result-object v0

    invoke-virtual {v0, v2}, Ll/ᩳۜ;->ۤ(I)V

    :cond_1
    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ܿۛ᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܿۛ᩸;->֫ۙ()V

    return-void
.end method

.method private ܽۙ()V
    .locals 9

    .line 1022
    iget-object v0, p0, Ll/ܿۛ᩸;->۫᩷:Ll/۟᩷ۙ;

    const v1, 0x800003

    invoke-virtual {v0, v1}, Ll/۟᩷ۙ;->᩸(I)Z

    move-result v0

    .line 1023
    iget-object v1, p0, Ll/ܿۛ᩸;->᩵᩷:Ll/᩻ᩳ᩷;

    invoke-virtual {v1}, Ll/᩻ᩳ᩷;->getLayoutManager()Ll/᩶۟᩷;

    move-result-object v1

    check-cast v1, Ll/֡֡᩷;

    .line 1024
    invoke-static {v1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1025
    invoke-virtual {v1}, Ll/֡֡᩷;->findFirstVisibleItemPosition()I

    move-result v2

    .line 1026
    invoke-virtual {v1}, Ll/᩶۟᩷;->getChildCount()I

    move-result v1

    add-int/2addr v1, v2

    .line 1027
    iget v3, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    const/4 v4, 0x2

    const-wide/16 v5, 0xc8

    const-string v7, "alpha"

    const/4 v8, 0x0

    if-lt v3, v2, :cond_1

    if-lt v3, v1, :cond_0

    goto :goto_0

    .line 1036
    :cond_0
    iget-boolean v1, p0, Ll/ܿۛ᩸;->᩺᩷:Z

    if-eqz v1, :cond_2

    .line 1037
    iput-boolean v8, p0, Ll/ܿۛ᩸;->᩺᩷:Z

    if-eqz v0, :cond_2

    .line 1039
    iget-object v0, p0, Ll/ܿۛ᩸;->ۗ᩷:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    new-array v1, v4, [F

    fill-array-data v1, :array_0

    invoke-static {v0, v7, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 1040
    new-instance v1, Ll/᩹ۛ᩸;

    invoke-direct {v1, p0}, Ll/᩹ۛ᩸;-><init>(Ll/ܿۛ᩸;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 1061
    invoke-virtual {v0, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void

    .line 1028
    :cond_1
    :goto_0
    iget-boolean v1, p0, Ll/ܿۛ᩸;->᩺᩷:Z

    if-nez v1, :cond_2

    const/4 v1, 0x1

    .line 1029
    iput-boolean v1, p0, Ll/ܿۛ᩸;->᩺᩷:Z

    if-eqz v0, :cond_2

    .line 1031
    iget-object v0, p0, Ll/ܿۛ᩸;->ۗ᩷:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v0, v8}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 1032
    iget-object v0, p0, Ll/ܿۛ᩸;->ۗ᩷:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 1033
    iget-object v0, p0, Ll/ܿۛ᩸;->ۗ᩷:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    new-array v1, v4, [F

    fill-array-data v1, :array_1

    invoke-static {v0, v7, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    :cond_2
    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static bridge synthetic ᩴ(Ll/ܿۛ᩸;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    return p0
.end method

.method private ᩷(IZ)I
    .locals 2

    .line 1194
    :goto_0
    iget-object v0, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    .line 1195
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟ܰ᩸;

    if-nez p2, :cond_0

    .line 1196
    invoke-virtual {v0}, Ll/ۜܽ᩸;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return p1
.end method

.method public static ᩷(Ll/ܿۛ᩸;)V
    .locals 4

    const/4 v0, 0x1

    .line 793
    iput-boolean v0, p0, Ll/ܿۛ᩸;->ܳ᩷:Z

    const/4 v0, 0x0

    .line 795
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟ܰ᩸;

    .line 796
    invoke-virtual {v2}, Ll/ۜܽ᩸;->ۚ()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Ll/ۜܽ᩸;->ۧ()Z

    move-result v3

    if-nez v3, :cond_0

    .line 3264
    invoke-virtual {p0, v2}, Ll/ܿۛ᩸;->ۙ(Ll/۟ܰ᩸;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 801
    :cond_1
    iput-boolean v0, p0, Ll/ܿۛ᩸;->ܳ᩷:Z

    return-void

    :catchall_0
    move-exception v1

    iput-boolean v0, p0, Ll/ܿۛ᩸;->ܳ᩷:Z

    .line 802
    throw v1
.end method

.method public static ᩷(Ll/ܿۛ᩸;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1126
    invoke-direct {p0, p1, v0}, Ll/ܿۛ᩸;->ۤ(IZ)V

    return-void
.end method

.method public static synthetic ᩷(Ll/ܿۛ᩸;ILandroid/widget/CheckBox;)V
    .locals 3

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 821
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 822
    new-instance p1, Ll/ۜۨ᩸;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, p1}, Ll/ۢۚܺ;->ۙ(Ljava/util/List;Ljava/util/function/Predicate;)V

    .line 823
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    .line 824
    new-instance p2, Ljava/util/LinkedList;

    invoke-direct {p2}, Ljava/util/LinkedList;-><init>()V

    .line 825
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ܰ᩸;

    .line 826
    new-instance v2, Ll/᩺ۛ᩸;

    invoke-direct {v2, p0, p2, v1, p1}, Ll/᩺ۛ᩸;-><init>(Ll/ܿۛ᩸;Ljava/util/LinkedList;Ll/۟ܰ᩸;Z)V

    invoke-virtual {p2, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 828
    :cond_0
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 829
    iput-boolean p1, p0, Ll/ܿۛ᩸;->ܳ᩷:Z

    .line 830
    invoke-virtual {p2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩺ۛ᩸;

    invoke-virtual {p0}, Ll/᩺ۛ᩸;->ۙ()V

    :cond_1
    return-void
.end method

.method public static bridge synthetic ᩸(Ll/ܿۛ᩸;)Ll/ۗۛ᩸;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۛ᩸;->᩸᩷:Ll/ۗۛ᩸;

    return-object p0
.end method

.method public static bridge synthetic ᩹(Ll/ܿۛ᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܿۛ᩸;->ܽۙ()V

    return-void
.end method

.method public static bridge synthetic ᩻(Ll/ܿۛ᩸;)Ll/֨ܰ᩸;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۛ᩸;->᩶᩷:Ll/֨ܰ᩸;

    return-object p0
.end method

.method private ᩻ۙ()V
    .locals 6

    .line 1208
    invoke-static {}, Ll/᩶ۨ᩸;->ۤ()Ll/᩷ۨᩴ;

    move-result-object v0

    const v1, 0x67821367

    .line 0
    invoke-static {v1}, Ll/ܰۡۗ;->ۙ(I)Ll/ۛۚۤ;

    move-result-object v1

    .line 1211
    iget-object v2, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟ܰ᩸;

    .line 1212
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 114
    invoke-virtual {v3}, Ll/ۧ۫ۙ;->requireArguments()Landroid/os/Bundle;

    move-result-object v3

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    .line 115
    invoke-virtual {v4}, Landroid/os/Parcel;->marshall()[B

    move-result-object v3

    .line 116
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 1212
    invoke-virtual {v1, v3}, Ll/ۛۚۤ;->᩷([B)V

    goto :goto_0

    .line 1214
    :cond_0
    new-instance v2, Ll/۟᩶᩸;

    sget-object v3, Ll/ܿۛ᩸;->۟᩷:Ljava/lang/Object;

    invoke-direct {v2, v0, v1, v3}, Ll/۟᩶᩸;-><init>(Ll/᩷ۨᩴ;Ll/ۛۚۤ;Ljava/lang/Object;)V

    .line 33
    :try_start_0
    invoke-virtual {v2}, Ll/۟᩶᩸;->ۙ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 272
    invoke-super {p0, p1}, Ll/ܽ֡֫;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 273
    invoke-direct {p0}, Ll/ܿۛ᩸;->ܺۙ()V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 9

    .line 155
    invoke-super {p0, p1}, Ll/ܽ֡֫;->onCreate(Landroid/os/Bundle;)V

    const-string v0, ""

    .line 156
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    const v0, 0x7f0d0054

    .line 157
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    .line 158
    invoke-virtual {p0}, Ll/ܽ֡֫;->ܰ()V

    .line 160
    invoke-virtual {p0}, Ll/ܽ֡֫;->ᩳ()Ll/ᩳۜ;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ll/ᩳۜ;->᩷(I)V

    .line 161
    invoke-direct {p0}, Ll/ܿۛ᩸;->ܺۙ()V

    const v0, 0x7f0a068a

    .line 163
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ܶ᩹;

    iput-object v0, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    .line 164
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->ۙ(Ll/ܶ᩹;)V

    .line 166
    invoke-virtual {p0}, Ll/ۚۤ;->getOnBackPressedDispatcher()Ll/ۜۤ;

    move-result-object v0

    .line 478
    new-instance v1, Ll/ۧۛ᩸;

    invoke-direct {v1, p0}, Ll/ۧۛ᩸;-><init>(Ll/ܿۛ᩸;)V

    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    invoke-virtual {v0, v1}, Ll/ۜۤ;->ۙ(Ll/ۛۤ;)Ll/֡᩷;

    const v0, 0x7f0a03e5

    .line 168
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Ll/᩷ۛ᩸;

    invoke-direct {v1, p0}, Ll/᩷ۛ᩸;-><init>(Ll/ܿۛ᩸;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a017c

    .line 170
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ܶ᩹;

    iput-object v0, p0, Ll/ܿۛ᩸;->ۚ᩷:Ll/ܶ᩹;

    const v1, 0x7f120c20

    .line 171
    invoke-virtual {v0, v1}, Ll/ܶ᩹;->setTitle(I)V

    .line 172
    iget-object v0, p0, Ll/ܿۛ᩸;->ۚ᩷:Ll/ܶ᩹;

    const v1, 0x7f0f0020

    invoke-virtual {v0, v1}, Ll/ܶ᩹;->inflateMenu(I)V

    .line 173
    new-instance v0, Ll/۠᩶᩻;

    iget-object v1, p0, Ll/ܿۛ᩸;->ۚ᩷:Ll/ܶ᩹;

    const v2, 0x7f0a0375

    const v3, 0x7f0a03f0

    filled-new-array {v2, v3}, [I

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll/۠᩶᩻;-><init>(Ll/ܶ᩹;[I)V

    iput-object v0, p0, Ll/ܿۛ᩸;->ۘ᩷:Ll/۠᩶᩻;

    .line 174
    iget-object v0, p0, Ll/ܿۛ᩸;->ۚ᩷:Ll/ܶ᩹;

    new-instance v1, Ll/ۤۛ᩸;

    invoke-direct {v1, p0}, Ll/ۤۛ᩸;-><init>(Ll/ܿۛ᩸;)V

    invoke-virtual {v0, v1}, Ll/ܶ᩹;->setOnMenuItemClickListener(Ll/᩻᩹;)V

    const v0, 0x7f0a017b

    .line 176
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/۟᩷ۙ;

    iput-object v0, p0, Ll/ܿۛ᩸;->۫᩷:Ll/۟᩷ۙ;

    const v0, 0x7f0a0221

    .line 178
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    iput-object v0, p0, Ll/ܿۛ᩸;->ۗ᩷:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 179
    iget-object v2, p0, Ll/ܿۛ᩸;->۫᩷:Ll/۟᩷ۙ;

    const v0, 0x7f0a017a

    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v3

    iget-object v4, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    const v0, 0x7f0a02fc

    .line 180
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v5

    iget-object v6, p0, Ll/ܿۛ᩸;->ۚ᩷:Ll/ܶ᩹;

    iget-object v7, p0, Ll/ܿۛ᩸;->ۗ᩷:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-object v1, p0

    .line 179
    invoke-virtual/range {v1 .. v7}, Ll/ܽ֡֫;->ۙ(Ll/۟᩷ۙ;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    .line 181
    iget-object v0, p0, Ll/ܿۛ᩸;->۫᩷:Ll/۟᩷ۙ;

    new-instance v1, Ll/᩸ۛ᩸;

    invoke-direct {v1, p0}, Ll/᩸ۛ᩸;-><init>(Ll/ܿۛ᩸;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 196
    new-instance v0, Ll/᩷ᩴ;

    iget-object v1, p0, Ll/ܿۛ᩸;->۫᩷:Ll/۟᩷ۙ;

    iget-object v2, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    invoke-direct {v0, p0, v1, v2}, Ll/᩷ᩴ;-><init>(Ll/ܽ֡֫;Ll/۟᩷ۙ;Ll/ܶ᩹;)V

    .line 197
    invoke-virtual {v0}, Ll/᩷ᩴ;->ۙ()Ll/᩺۫;

    move-result-object v1

    sget-object v2, Ll/ۗۡ֫;->֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/᩺۫;->ۙ(I)V

    .line 198
    iget-object v1, p0, Ll/ܿۛ᩸;->۫᩷:Ll/۟᩷ۙ;

    invoke-virtual {v1, v0}, Ll/۟᩷ۙ;->ۙ(Ll/ۛ᩷ۙ;)V

    .line 199
    invoke-virtual {v0}, Ll/᩷ᩴ;->᩷()V

    .line 200
    iget-object v0, p0, Ll/ܿۛ᩸;->۫᩷:Ll/۟᩷ۙ;

    new-instance v1, Ll/֫ۛ᩸;

    invoke-direct {v1, p0}, Ll/֫ۛ᩸;-><init>(Ll/ܿۛ᩸;)V

    invoke-virtual {v0, v1}, Ll/۟᩷ۙ;->ۙ(Ll/ۛ᩷ۙ;)V

    .line 245
    new-instance v0, Ll/ܶܺۙ;

    invoke-direct {v0, p0}, Ll/ܶܺۙ;-><init>(Ll/ۗܺۙ;)V

    const-class v1, Ll/֨ܰ᩸;

    invoke-virtual {v0, v1}, Ll/ܶܺۙ;->ۙ(Ljava/lang/Class;)Ll/۫ܺۙ;

    move-result-object v0

    check-cast v0, Ll/֨ܰ᩸;

    iput-object v0, p0, Ll/ܿۛ᩸;->᩶᩷:Ll/֨ܰ᩸;

    .line 246
    iget-object v1, p0, Ll/ܿۛ᩸;->ܺ᩷:Ll/۬ۨ᩸;

    invoke-virtual {v0, p0, v1}, Ll/֨ܰ᩸;->ۙ(Ll/ۤ᩻ۙ;Ll/ܶ᩻ۙ;)V

    .line 247
    new-instance v0, Ll/ܶܺۙ;

    invoke-direct {v0, p0}, Ll/ܶܺۙ;-><init>(Ll/ۗܺۙ;)V

    const-class v1, Ll/ۨۧۧ;

    invoke-virtual {v0, v1}, Ll/ܶܺۙ;->ۙ(Ljava/lang/Class;)Ll/۫ܺۙ;

    move-result-object v0

    check-cast v0, Ll/ۨۧۧ;

    iput-object v0, p0, Ll/ܿۛ᩸;->ܰ᩷:Ll/ۨۧۧ;

    .line 248
    new-instance v0, Ll/᩹۫ۧ;

    invoke-direct {v0}, Ll/᩹۫ۧ;-><init>()V

    iput-object v0, p0, Ll/ܿۛ᩸;->᩹᩷:Ll/᩹۫ۧ;

    .line 249
    new-instance v0, Ll/ᩴۛ᩸;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ᩴۛ᩸;-><init>(ILjava/lang/Object;)V

    const-wide/16 v1, 0x1f4

    invoke-static {v0, v1, v2}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;J)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 1222
    :goto_0
    sget-object v0, Ll/ܿۛ᩸;->۟᩷:Ljava/lang/Object;

    monitor-enter v0

    .line 1223
    :try_start_0
    invoke-static {}, Ll/᩶ۨ᩸;->ۤ()Ll/᩷ۨᩴ;

    move-result-object v4

    .line 1224
    invoke-virtual {v4}, Ll/᩷ۨᩴ;->֨()Z

    move-result v5

    if-nez v5, :cond_1

    .line 1225
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    .line 1228
    :cond_1
    :try_start_1
    invoke-virtual {v4}, Ll/᩷ۨᩴ;->ܶ᩷()[B

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v4

    .line 1230
    :try_start_2
    iget-object v5, p0, Ll/ܿۛ᩸;->᩶᩷:Ll/֨ܰ᩸;

    invoke-virtual {v5, v4}, Ll/֨ܰ᩸;->ۙ(Ljava/lang/Throwable;)V

    const/4 v4, 0x0

    .line 1232
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v4, :cond_7

    .line 1235
    :try_start_3
    new-instance v0, Ll/᩵ۚۤ;

    invoke-direct {v0, v4}, Ll/᩵ۚۤ;-><init>([B)V

    const v4, 0x67821367

    .line 1236
    invoke-static {v0, v4}, Ll/ܽۚۤ;->ۙ(Ll/ܶۚۤ;I)V

    .line 1237
    :cond_2
    :goto_2
    invoke-virtual {v0}, Ll/᩵ۚۤ;->available()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-lez v8, :cond_7

    .line 1238
    invoke-virtual {v0}, Ll/᩵ۚۤ;->ۚ᩷()[B

    move-result-object v4

    .line 1239
    new-instance v5, Ll/۟ܰ᩸;

    invoke-direct {v5}, Ll/۟ܰ᩸;-><init>()V

    .line 121
    invoke-virtual {v5}, Ll/ۧ۫ۙ;->getArguments()Landroid/os/Bundle;

    move-result-object v6

    if-nez v6, :cond_6

    .line 124
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v6

    .line 125
    array-length v7, v4

    invoke-virtual {v6, v4, v1, v7}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 126
    invoke-virtual {v6, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 127
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 128
    invoke-virtual {v4, v6}, Landroid/os/Bundle;->readFromParcel(Landroid/os/Parcel;)V

    .line 129
    invoke-virtual {v5, v4}, Ll/ۧ۫ۙ;->setArguments(Landroid/os/Bundle;)V

    .line 130
    invoke-virtual {v6}, Landroid/os/Parcel;->recycle()V

    .line 1241
    invoke-virtual {p0}, Ll/ۗ۫ۙ;->᩹()Ll/ۗۚۙ;

    move-result-object v4

    invoke-virtual {v5}, Ll/ۜܽ᩸;->۫()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ll/ۗۚۙ;->᩷(Ljava/lang/String;)Ll/ۧ۫ۙ;

    move-result-object v4

    if-eqz v3, :cond_5

    if-eqz v4, :cond_4

    .line 1244
    check-cast v4, Ll/۟ܰ᩸;

    .line 1246
    invoke-virtual {v4}, Ll/ۜܽ᩸;->᩷()Z

    move-result v5
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    if-nez v5, :cond_3

    .line 1248
    :try_start_4
    invoke-virtual {v4}, Ll/ۜܽ᩸;->᩹()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_3

    :catch_1
    move-exception v5

    .line 1250
    :try_start_5
    iget-object v6, p0, Ll/ܿۛ᩸;->᩶᩷:Ll/֨ܰ᩸;

    invoke-virtual {v6, v5}, Ll/֨ܰ᩸;->ۙ(Ljava/lang/Throwable;)V

    .line 1253
    :cond_3
    :goto_3
    invoke-virtual {v4}, Ll/ۜܽ᩸;->᩷()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 1254
    iget-object v5, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1257
    :cond_4
    invoke-virtual {v5}, Ll/ۜܽ᩸;->᩹()V

    .line 1258
    invoke-virtual {v5}, Ll/ۜܽ᩸;->᩷()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1259
    iget-object v4, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1263
    :cond_5
    invoke-static {v4}, Ll/ۧ᩻ܺ;->᩷(Ljava/lang/Object;)V

    .line 1264
    invoke-virtual {v5}, Ll/ۜܽ᩸;->᩹()V

    .line 1265
    invoke-virtual {v5}, Ll/ۜܽ᩸;->᩷()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1266
    iget-object v4, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 122
    :cond_6
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v3, "Arguments is not null."

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    :catch_2
    move-exception v0

    .line 1271
    iget-object v3, p0, Ll/ܿۛ᩸;->᩶᩷:Ll/֨ܰ᩸;

    invoke-virtual {v3, v0}, Ll/֨ܰ᩸;->ۙ(Ljava/lang/Throwable;)V

    .line 1274
    :cond_7
    iget-object v0, p0, Ll/ܿۛ᩸;->᩶᩷:Ll/֨ܰ᩸;

    iget-boolean v3, v0, Ll/֨ܰ᩸;->ܿ:Z

    if-eqz v3, :cond_9

    .line 1275
    iput-boolean v1, v0, Ll/֨ܰ᩸;->ܿ:Z

    .line 1276
    invoke-static {}, Ll/᩶ۨ᩸;->ۙ()Ll/᩷ۨᩴ;

    move-result-object v0

    .line 413
    invoke-virtual {v0, v2}, Ll/᩷ۨᩴ;->᩷(Z)Ljava/util/List;

    move-result-object v0

    .line 1277
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const-string v4, "current|list"

    .line 51
    invoke-static {v4}, Ll/ܿܶۤ;->ۙ(Ljava/lang/String;)Ll/ܿܶۤ;

    move-result-object v4

    const-string v5, ""

    invoke-virtual {v4, v5}, Ll/ܿܶۤ;->matcher(Ljava/lang/CharSequence;)Ll/ۘܶۤ;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    .line 1279
    :goto_4
    iget-object v5, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_8

    .line 1280
    iget-object v5, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۟ܰ᩸;

    invoke-virtual {v5}, Ll/ۜܽ᩸;->۫()Ljava/lang/String;

    move-result-object v5

    .line 55
    invoke-static {v5}, Ll/ܽۚܺ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 56
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "((-\\d+)?\\.dat|\\.tat|\\.lit|\\.e2)"

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/ܿܶۤ;->ۙ(Ljava/lang/String;)Ll/ܿܶۤ;

    move-result-object v5

    const-string v6, ""

    invoke-virtual {v5, v6}, Ll/ܿܶۤ;->matcher(Ljava/lang/CharSequence;)Ll/ۘܶۤ;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 1282
    :cond_8
    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v4, Ll/ۚۛ᩸;

    invoke-direct {v4, v3}, Ll/ۚۛ᩸;-><init>(Ljava/util/ArrayList;)V

    invoke-interface {v0, v4}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v3, Ll/ܿۨ᩸;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1291
    invoke-interface {v0, v3}, Ll/᩵ܺۗ;->forEach(Ljava/util/function/Consumer;)V

    .line 952
    :cond_9
    :goto_5
    new-instance v0, Ll/ۗۛ᩸;

    invoke-direct {v0, p0}, Ll/ۗۛ᩸;-><init>(Ll/ܿۛ᩸;)V

    iput-object v0, p0, Ll/ܿۛ᩸;->᩸᩷:Ll/ۗۛ᩸;

    const v0, 0x7f0a04d5

    .line 953
    invoke-virtual {p0, v0}, Ll/ۘᩴ;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/᩻ᩳ᩷;

    iput-object v0, p0, Ll/ܿۛ᩸;->᩵᩷:Ll/᩻ᩳ᩷;

    .line 954
    iget-object v3, p0, Ll/ܿۛ᩸;->᩸᩷:Ll/ۗۛ᩸;

    invoke-virtual {v0, v3}, Ll/᩻ᩳ᩷;->setAdapter(Ll/۫۟᩷;)V

    .line 955
    iget-object v0, p0, Ll/ܿۛ᩸;->᩵᩷:Ll/᩻ᩳ᩷;

    new-instance v3, Ll/֡֡᩷;

    invoke-direct {v3, p0}, Ll/֡֡᩷;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v3}, Ll/᩻ᩳ᩷;->setLayoutManager(Ll/᩶۟᩷;)V

    .line 957
    iget-object v0, p0, Ll/ܿۛ᩸;->᩵᩷:Ll/᩻ᩳ᩷;

    invoke-virtual {v0}, Ll/᩻ᩳ᩷;->getItemAnimator()Ll/ۗ۟᩷;

    move-result-object v0

    const-wide/16 v3, 0xc8

    invoke-virtual {v0, v3, v4}, Ll/ۗ۟᩷;->ۙ(J)V

    .line 958
    iget-object v0, p0, Ll/ܿۛ᩸;->᩵᩷:Ll/᩻ᩳ᩷;

    invoke-virtual {v0}, Ll/᩻ᩳ᩷;->getItemAnimator()Ll/ۗ۟᩷;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ll/ۗ۟᩷;->᩸(J)V

    .line 959
    iget-object v0, p0, Ll/ܿۛ᩸;->᩵᩷:Ll/᩻ᩳ᩷;

    invoke-virtual {v0}, Ll/᩻ᩳ᩷;->getItemAnimator()Ll/ۗ۟᩷;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ll/ۗ۟᩷;->ۤ(J)V

    .line 960
    iget-object v0, p0, Ll/ܿۛ᩸;->᩵᩷:Ll/᩻ᩳ᩷;

    invoke-virtual {v0}, Ll/᩻ᩳ᩷;->getItemAnimator()Ll/ۗ۟᩷;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ll/ۗ۟᩷;->᩷(J)V

    .line 961
    iget-object v0, p0, Ll/ܿۛ᩸;->ۗ᩷:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    new-instance v3, Ll/۟ۨ᩸;

    const/4 v4, 0x0

    invoke-direct {v3, v4, p0}, Ll/۟ۨ᩸;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 962
    iget-object v0, p0, Ll/ܿۛ᩸;->᩵᩷:Ll/᩻ᩳ᩷;

    new-instance v3, Ll/ܺۛ᩸;

    invoke-direct {v3, p0}, Ll/ܺۛ᩸;-><init>(Ll/ܿۛ᩸;)V

    invoke-virtual {v0, v3}, Ll/᩻ᩳ᩷;->addOnScrollListener(Ll/ۢ۟᩷;)V

    .line 969
    iget-object v0, p0, Ll/ܿۛ᩸;->᩵᩷:Ll/᩻ᩳ᩷;

    new-instance v3, Ll/ۧ֡᩻;

    iget-object v4, p0, Ll/ܿۛ᩸;->ۘ᩷:Ll/۠᩶᩻;

    invoke-static {v4}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Ll/ᩳۨ᩸;

    invoke-direct {v5, v4}, Ll/ᩳۨ᩸;-><init>(Ll/۠᩶᩻;)V

    invoke-direct {v3, v0, v5}, Ll/ۧ֡᩻;-><init>(Ll/᩻ᩳ᩷;Ljava/util/function/BooleanSupplier;)V

    invoke-virtual {v0, v3}, Ll/᩻ᩳ᩷;->addOnItemTouchListener(Ll/ᩳ۟᩷;)V

    .line 970
    new-instance v0, Ll/ۨ֡᩷;

    new-instance v3, Ll/ܶۛ᩸;

    invoke-direct {v3, p0}, Ll/ܶۛ᩸;-><init>(Ll/ܿۛ᩸;)V

    invoke-direct {v0, v3}, Ll/ۨ֡᩷;-><init>(Ll/ܺ֡᩷;)V

    iput-object v0, p0, Ll/ܿۛ᩸;->ܶ᩷:Ll/ۨ֡᩷;

    .line 1016
    iget-object v3, p0, Ll/ܿۛ᩸;->᩵᩷:Ll/᩻ᩳ᩷;

    invoke-virtual {v0, v3}, Ll/ۨ֡᩷;->ۙ(Ll/᩻ᩳ᩷;)V

    .line 1017
    iget-object v0, p0, Ll/ܿۛ᩸;->ۘ᩷:Ll/۠᩶᩻;

    iget-object v3, p0, Ll/ܿۛ᩸;->᩸᩷:Ll/ۗۛ᩸;

    invoke-virtual {v0, v3}, Ll/۠᩶᩻;->ۙ(Ll/۫۟᩷;)V

    .line 1018
    iget-object v0, p0, Ll/ܿۛ᩸;->ۘ᩷:Ll/۠᩶᩻;

    iget-object v3, p0, Ll/ܿۛ᩸;->ܶ᩷:Ll/ۨ֡᩷;

    invoke-virtual {v0, v3}, Ll/۠᩶᩻;->ۙ(Ll/ۨ֡᩷;)V

    .line 253
    invoke-direct {p0}, Ll/ܿۛ᩸;->ܽۙ()V

    if-nez p1, :cond_a

    .line 257
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-direct {p0, p1, v1, v2}, Ll/ܿۛ᩸;->ۙ(Landroid/content/Intent;ZZ)Z

    move-result p1

    goto :goto_6

    :cond_a
    const/4 p1, 0x0

    :goto_6
    if-nez p1, :cond_b

    .line 439
    iget p1, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    const/4 v0, -0x1

    if-ne p1, v0, :cond_b

    .line 442
    invoke-direct {p0}, Ll/ܿۛ᩸;->ۚۙ()I

    move-result p1

    if-eq p1, v0, :cond_b

    .line 1126
    invoke-direct {p0, p1, v1}, Ll/ܿۛ᩸;->ۤ(IZ)V

    :cond_b
    return-void

    :catchall_0
    move-exception p1

    .line 1232
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p1
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .line 286
    invoke-super {p0, p1}, Ll/ۚۤ;->onNewIntent(Landroid/content/Intent;)V

    .line 287
    iget-boolean v0, p0, Ll/ܿۛ᩸;->ܽ᩷:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 295
    invoke-direct {p0, p1, v0, v0}, Ll/ܿۛ᩸;->ۙ(Landroid/content/Intent;ZZ)Z

    return-void
.end method

.method public final onPause()V
    .locals 0

    .line 589
    invoke-super {p0}, Ll/ܽ֡֫;->onPause()V

    .line 590
    invoke-direct {p0}, Ll/ܿۛ᩸;->ۧۙ()V

    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .line 583
    invoke-super {p0, p1}, Ll/ۚۤ;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 584
    invoke-direct {p0}, Ll/ܿۛ᩸;->ۧۙ()V

    return-void
.end method

.method public final onStop()V
    .locals 1

    const/4 v0, 0x0

    .line 266
    iput-boolean v0, p0, Ll/ܿۛ᩸;->ۧ᩷:Z

    .line 267
    invoke-super {p0}, Ll/ܽ֡֫;->onStop()V

    return-void
.end method

.method public final ۙ(Landroid/view/MenuItem;)V
    .locals 3

    .line 597
    sget-object v0, Ll/ܰ᩺᩻;->ۧۙ:Ll/᩻֫ܺ;

    invoke-virtual {v0}, Ll/᩻֫ܺ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 600
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f0a0175

    if-ne v0, v1, :cond_1

    .line 602
    iget-object p1, p0, Ll/ܿۛ᩸;->ۘ᩷:Ll/۠᩶᩻;

    const/4 v0, 0x1

    .line 77
    invoke-virtual {p1, v0}, Ll/۠᩶᩻;->ۙ(Z)V

    return-void

    .line 603
    :cond_1
    iget-object v1, p0, Ll/ܿۛ᩸;->ۘ᩷:Ll/۠᩶᩻;

    invoke-virtual {v1}, Ll/۠᩶᩻;->᩷()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const v1, 0x7f0a03b7

    .line 605
    iget-object v2, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    if-ne v0, v1, :cond_6

    .line 621
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 622
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ܰ᩸;

    .line 623
    invoke-virtual {v1}, Ll/ۜܽ᩸;->ۚ()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Ll/ۜܽ᩸;->ܽ()Z

    move-result v2

    if-nez v2, :cond_3

    .line 2327
    new-instance v2, Ll/᩶ܰ᩸;

    invoke-direct {v2, v1, p0}, Ll/᩶ܰ᩸;-><init>(Ll/۟ܰ᩸;Ll/ܿۛ᩸;)V

    .line 624
    invoke-virtual {p1, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 627
    :cond_4
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    const p1, 0x7f120a90

    .line 628
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    .line 631
    :cond_5
    new-instance v0, Ll/᩻ۛ᩸;

    invoke-direct {v0, p0, p1}, Ll/᩻ۛ᩸;-><init>(Ll/ܿۛ᩸;Ljava/util/LinkedList;)V

    .line 670
    invoke-virtual {v0}, Ll/ۖۙܺ;->۫()V

    return-void

    :cond_6
    const v1, 0x7f0a0375

    if-ne v0, v1, :cond_7

    .line 608
    invoke-virtual {p0}, Ll/ܿۛ᩸;->ۤۙ()V

    .line 609
    invoke-virtual {p0}, Ll/ܿۛ᩸;->᩷ۙ()V

    return-void

    :cond_7
    const v1, 0x7f0a03c1

    if-ne v0, v1, :cond_8

    .line 611
    iget v0, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟ܰ᩸;

    .line 612
    invoke-virtual {v0, p1}, Ll/۟ܰ᩸;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    :cond_8
    :goto_1
    return-void
.end method

.method public final ۙ(Ll/۟ܰ᩸;)V
    .locals 6

    .line 1078
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_9

    .line 1081
    iget-object v0, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 1082
    :goto_0
    invoke-static {v2}, Ll/ۧ᩻ܺ;->ۙ(Z)V

    .line 1083
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-le v2, v4, :cond_3

    iget v2, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    if-ne v1, v2, :cond_3

    if-lez v2, :cond_1

    sub-int/2addr v2, v4

    .line 1085
    invoke-direct {p0, v2, v4}, Ll/ܿۛ᩸;->ۤ(IZ)V

    goto :goto_1

    :cond_1
    add-int/2addr v2, v4

    .line 1087
    invoke-direct {p0, v2, v4}, Ll/ܿۛ᩸;->ۤ(IZ)V

    .line 1089
    :goto_1
    iget v2, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    if-eq v1, v2, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    invoke-static {v2}, Ll/ۧ᩻ܺ;->ۙ(Z)V

    .line 1092
    :cond_3
    invoke-virtual {p0}, Ll/ۗ۫ۙ;->᩹()Ll/ۗۚۙ;

    move-result-object v2

    invoke-virtual {p1}, Ll/ۜܽ᩸;->۫()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ll/ۗۚۙ;->᩷(Ljava/lang/String;)Ll/ۧ۫ۙ;

    move-result-object v2

    if-eqz v2, :cond_5

    if-ne p1, v2, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    .line 1094
    :goto_3
    invoke-static {v2}, Ll/ۧ᩻ܺ;->ۙ(Z)V

    .line 1095
    invoke-virtual {p0}, Ll/ۗ۫ۙ;->᩹()Ll/ۗۚۙ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۗۚۙ;->᩷()Ll/ۙ֫ۙ;

    move-result-object v2

    invoke-virtual {v2, p1}, Ll/ۙ֫ۙ;->ۤ(Ll/ۧ۫ۙ;)Ll/ۙ֫ۙ;

    invoke-virtual {v2}, Ll/ۙ֫ۙ;->᩷()I

    goto :goto_5

    .line 1097
    :cond_5
    invoke-virtual {p1}, Ll/ۧ۫ۙ;->isAdded()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {p1}, Ll/ۧ۫ۙ;->isDetached()Z

    move-result v2

    if-nez v2, :cond_6

    const/4 v2, 0x1

    goto :goto_4

    :cond_6
    const/4 v2, 0x0

    :goto_4
    invoke-static {v2}, Ll/ۧ᩻ܺ;->ۙ(Z)V

    .line 1100
    :goto_5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1101
    iget v2, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    if-ge v1, v2, :cond_7

    sub-int/2addr v2, v4

    .line 1102
    iput v2, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    .line 1103
    invoke-direct {p0}, Ll/ܿۛ᩸;->֫ۙ()V

    .line 1104
    invoke-direct {p0}, Ll/ܿۛ᩸;->ܽۙ()V

    .line 1106
    :cond_7
    iget-object v2, p0, Ll/ܿۛ᩸;->᩸᩷:Ll/ۗۛ᩸;

    invoke-virtual {v2, v1}, Ll/۫۟᩷;->notifyItemRemoved(I)V

    .line 1107
    invoke-virtual {p1}, Ll/۟ܰ᩸;->ۨ()V

    .line 1109
    invoke-direct {p0}, Ll/ܿۛ᩸;->᩻ۙ()V

    .line 1110
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_8

    .line 1111
    invoke-virtual {p0, v3}, Ll/ܿۛ᩸;->᩷(Z)V

    :cond_8
    return-void

    .line 1079
    :cond_9
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final ۤ(I)Landroid/view/View;
    .locals 1

    .line 466
    iget-object p1, p0, Ll/ܿۛ᩸;->᩹᩷:Ll/᩹۫ۧ;

    if-eqz p1, :cond_0

    const v0, 0x7f0d0053

    .line 467
    invoke-virtual {p1, v0}, Ll/᩹۫ۧ;->ۙ(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۤ(Landroid/content/Intent;)V
    .locals 1

    .line 122
    iget-object v0, p0, Ll/ܿۛ᩸;->ܿ᩷:Ll/ۗۤۧ;

    invoke-virtual {v0, p1}, Ll/ۗۤۧ;->ۙ(Landroid/content/Intent;)V

    return-void
.end method

.method public final ۤ(Z)V
    .locals 6

    .line 536
    iget-boolean v0, p0, Ll/ܿۛ᩸;->ۨ᩷:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 538
    iput-boolean v0, p0, Ll/ܿۛ᩸;->ۨ᩷:Z

    .line 540
    iget-object v1, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    if-eqz p1, :cond_7

    .line 541
    iget p1, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟ܰ᩸;

    .line 542
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 543
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۟ܰ᩸;

    .line 544
    invoke-virtual {v4}, Ll/۟ܰ᩸;->ܺ()Z

    move-result v5

    if-eqz v5, :cond_1

    if-eq v4, p1, :cond_1

    invoke-virtual {v4}, Ll/ۜܽ᩸;->ۚ()Z

    move-result v5

    if-nez v5, :cond_1

    .line 545
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 548
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    xor-int/lit8 v4, v3, 0x1

    if-nez v3, :cond_4

    .line 550
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۟ܰ᩸;

    .line 551
    invoke-virtual {v5}, Ll/۟ܰ᩸;->ۨ()V

    goto :goto_1

    .line 553
    :cond_3
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 554
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v2

    iput v2, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    .line 556
    :cond_4
    invoke-virtual {p1}, Ll/۟ܰ᩸;->ܺ()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 557
    iget v2, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 558
    iget v1, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    if-lez v1, :cond_5

    sub-int/2addr v1, v0

    .line 559
    iput v1, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    .line 560
    :cond_5
    invoke-virtual {p1}, Ll/۟ܰ᩸;->ۨ()V

    goto :goto_2

    :cond_6
    move v0, v4

    :goto_2
    if-eqz v0, :cond_9

    .line 564
    invoke-direct {p0}, Ll/ܿۛ᩸;->֫ۙ()V

    .line 565
    invoke-direct {p0}, Ll/ܿۛ᩸;->᩻ۙ()V

    goto :goto_3

    .line 568
    :cond_7
    iget p1, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟ܰ᩸;

    .line 569
    invoke-virtual {p1}, Ll/۟ܰ᩸;->ܺ()Z

    move-result v2

    if-eqz v2, :cond_9

    .line 570
    iget v2, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 571
    iget v1, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    if-lez v1, :cond_8

    sub-int/2addr v1, v0

    .line 572
    iput v1, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    .line 573
    :cond_8
    invoke-virtual {p1}, Ll/۟ܰ᩸;->ۨ()V

    .line 574
    invoke-direct {p0}, Ll/ܿۛ᩸;->֫ۙ()V

    .line 575
    invoke-direct {p0}, Ll/ܿۛ᩸;->᩻ۙ()V

    :cond_9
    :goto_3
    const/4 p1, 0x0

    .line 578
    invoke-virtual {p0, p1}, Ll/ܿۛ᩸;->᩷(Z)V

    return-void
.end method

.method public final ۤۙ()V
    .locals 2

    .line 946
    iget-object v0, p0, Ll/ܿۛ᩸;->۫᩷:Ll/۟᩷ۙ;

    const v1, 0x800003

    invoke-virtual {v0, v1}, Ll/۟᩷ۙ;->᩸(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 947
    iget-object v0, p0, Ll/ܿۛ᩸;->۫᩷:Ll/۟᩷ۙ;

    invoke-virtual {v0, v1}, Ll/۟᩷ۙ;->ۙ(I)V

    :cond_0
    return-void
.end method

.method public final ۫(I)V
    .locals 5

    .line 739
    invoke-direct {p0, p1}, Ll/ܿۛ᩸;->ۚ(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const v1, 0x7f0d00e6

    .line 742
    invoke-virtual {p0, v1}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a03f4

    .line 743
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const v0, 0x7f120996

    invoke-virtual {p0, v0, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a00e1

    .line 744
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    .line 745
    new-instance v2, Ll/ۢۨ᩸;

    invoke-direct {v2, p0, p1, v0}, Ll/ۢۨ᩸;-><init>(Ll/ܿۛ᩸;ILandroid/widget/CheckBox;)V

    .line 759
    invoke-virtual {p0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p1

    invoke-virtual {p1, v1}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const v0, 0x7f1208c9

    .line 760
    invoke-virtual {p1, v0, v2}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f120161

    const/4 v1, 0x0

    .line 761
    invoke-virtual {p1, v0, v1}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 762
    invoke-virtual {p1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void
.end method

.method public final ܳ(I)V
    .locals 5

    .line 843
    invoke-direct {p0, p1}, Ll/ܿۛ᩸;->ۚ(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const v1, 0x7f0d00e6

    .line 846
    invoke-virtual {p0, v1}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a03f4

    .line 847
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const v0, 0x7f120993

    invoke-virtual {p0, v0, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a00e1

    .line 848
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    .line 849
    new-instance v2, Ll/ۡۨ᩸;

    invoke-direct {v2, p0, p1, v0}, Ll/ۡۨ᩸;-><init>(Ll/ܿۛ᩸;ILandroid/widget/CheckBox;)V

    .line 862
    invoke-virtual {p0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p1

    invoke-virtual {p1, v1}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const v0, 0x7f1208c9

    .line 863
    invoke-virtual {p1, v0, v2}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f120161

    const/4 v1, 0x0

    .line 864
    invoke-virtual {p1, v0, v1}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 865
    invoke-virtual {p1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void
.end method

.method public final ܳۙ()V
    .locals 1

    .line 937
    iget-object v0, p0, Ll/ܿۛ᩸;->᩸᩷:Ll/ۗۛ᩸;

    if-eqz v0, :cond_0

    .line 938
    invoke-virtual {v0}, Ll/۫۟᩷;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final ᩴ(I)V
    .locals 5

    .line 814
    invoke-direct {p0, p1}, Ll/ܿۛ᩸;->ۚ(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const v1, 0x7f0d00e6

    .line 817
    invoke-virtual {p0, v1}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a03f4

    .line 818
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const v0, 0x7f12098f

    invoke-virtual {p0, v0, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a00e1

    .line 819
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    .line 820
    new-instance v2, Ll/۠ۨ᩸;

    invoke-direct {v2, p0, p1, v0, v4}, Ll/۠ۨ᩸;-><init>(Ll/ܽ֡֫;ILandroid/widget/CheckBox;I)V

    .line 833
    invoke-virtual {p0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p1

    invoke-virtual {p1, v1}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const v0, 0x7f1208c9

    .line 834
    invoke-virtual {p1, v0, v2}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f120161

    const/4 v1, 0x0

    .line 835
    invoke-virtual {p1, v0, v1}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 836
    invoke-virtual {p1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void
.end method

.method public final ᩴۙ()Z
    .locals 3

    .line 506
    sget-object v0, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    const-string v1, "double_confirm_before_exit"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 507
    iget-object v0, p0, Ll/ܿۛ᩸;->֫᩷:Ll/᩻֫ܺ;

    invoke-virtual {v0}, Ll/᩻֫ܺ;->ۙ()Z

    move-result v0

    return v0

    :cond_0
    return v2
.end method

.method public final ᩶()Ljava/lang/String;
    .locals 1

    const-string v0, "TextEditor"

    return-object v0
.end method

.method public final ᩷(Ll/۟ܰ᩸;)V
    .locals 1

    .line 1119
    iget-object v0, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x0

    .line 1126
    invoke-direct {p0, p1, v0}, Ll/ܿۛ᩸;->ۤ(IZ)V

    :cond_0
    return-void
.end method

.method public final ᩷(Z)V
    .locals 2

    if-eqz p1, :cond_0

    .line 520
    invoke-virtual {p0}, Ll/ܿۛ᩸;->ᩴۙ()Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f12095a

    .line 521
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    .line 523
    :cond_0
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "exitToExternalApp="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Ll/ܿۛ᩸;->ۧ᩷:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 524
    invoke-direct {p0}, Ll/ܿۛ᩸;->ۧۙ()V

    .line 525
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 526
    iget-boolean p1, p0, Ll/ܿۛ᩸;->ۧ᩷:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    .line 527
    invoke-virtual {p0, p1}, Landroid/app/Activity;->moveTaskToBack(Z)Z

    :cond_1
    return-void
.end method

.method public final ᩷ۙ()V
    .locals 4

    .line 1067
    new-instance v0, Ll/۟ܰ᩸;

    invoke-direct {v0}, Ll/۟ܰ᩸;-><init>()V

    const/4 v1, 0x0

    .line 1068
    invoke-virtual {v0, v1}, Ll/ۜܽ᩸;->᩷(Ljava/lang/String;)V

    const-string v1, "filePath"

    const-string v2, "untitled"

    .line 1069
    iget-object v3, v0, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    invoke-virtual {v3, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1186
    iget-object v1, p0, Ll/ܿۛ᩸;->᩻᩷:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    .line 1187
    iput v2, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    .line 1189
    :cond_0
    iget v2, p0, Ll/ܿۛ᩸;->ᩴ᩷:I

    add-int/lit8 v2, v2, 0x1

    const/4 v3, 0x0

    invoke-direct {p0, v2, v3}, Ll/ܿۛ᩸;->᩷(IZ)I

    move-result v2

    .line 1071
    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1072
    invoke-direct {p0}, Ll/ܿۛ᩸;->᩻ۙ()V

    new-array v1, v3, [Ljava/lang/String;

    .line 352
    invoke-virtual {v0, v1}, Ll/۟ܰ᩸;->ۙ([Ljava/lang/String;)V

    .line 1126
    invoke-direct {p0, v2, v3}, Ll/ܿۛ᩸;->ۤ(IZ)V

    return-void
.end method

.method public final ᩸(I)V
    .locals 1

    .line 457
    iget-object p1, p0, Ll/ܿۛ᩸;->᩹᩷:Ll/᩹۫ۧ;

    if-eqz p1, :cond_0

    const v0, 0x7f0d0053

    .line 458
    invoke-virtual {p1, p0, v0}, Ll/᩹۫ۧ;->ۙ(Ll/ܽ֡֫;I)V

    :cond_0
    return-void
.end method

.method public final ᩸(Landroid/content/Intent;)V
    .locals 1

    const/4 v0, 0x0

    .line 295
    invoke-direct {p0, p1, v0, v0}, Ll/ܿۛ᩸;->ۙ(Landroid/content/Intent;ZZ)Z

    return-void
.end method

.method public final ᩸ۙ()Z
    .locals 1

    .line 732
    iget-boolean v0, p0, Ll/ܿۛ᩸;->ܳ᩷:Z

    return v0
.end method

.method public final ᩺()V
    .locals 1

    const/4 v0, 0x0

    .line 515
    iput-boolean v0, p0, Ll/ܿۛ᩸;->ۧ᩷:Z

    .line 516
    invoke-virtual {p0, v0}, Ll/ܿۛ᩸;->᩷(Z)V

    return-void
.end method
