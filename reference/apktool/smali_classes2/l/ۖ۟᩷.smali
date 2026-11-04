.class public final Ll/ۖ۟᩷;
.super Ljava/lang/Object;
.source "Y6A7"


# instance fields
.field public final ۙ:Ljava/util/ArrayList;

.field public final synthetic ۚ:Ll/᩻ᩳ᩷;

.field public ۤ:Ljava/util/ArrayList;

.field public ۫:I

.field public final ܳ:Ljava/util/List;

.field public ᩴ:I

.field public final ᩷:Ljava/util/ArrayList;

.field public ᩸:Ll/ۡ۟᩷;


# direct methods
.method public constructor <init>(Ll/᩻ᩳ᩷;)V
    .locals 1

    .line 6608
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖ۟᩷;->ۚ:Ll/᩻ᩳ᩷;

    .line 6609
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۖ۟᩷;->ۙ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 6610
    iput-object v0, p0, Ll/ۖ۟᩷;->ۤ:Ljava/util/ArrayList;

    .line 6612
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۖ۟᩷;->᩷:Ljava/util/ArrayList;

    .line 6615
    invoke-static {p1}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۖ۟᩷;->ܳ:Ljava/util/List;

    const/4 p1, 0x2

    .line 6617
    iput p1, p0, Ll/ۖ۟᩷;->ᩴ:I

    .line 6618
    iput p1, p0, Ll/ۖ۟᩷;->۫:I

    return-void
.end method

.method public static ۙ(Landroid/view/ViewGroup;Z)V
    .locals 4

    .line 7060
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_1

    .line 7061
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 7062
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_0

    .line 7063
    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2, v1}, Ll/ۖ۟᩷;->ۙ(Landroid/view/ViewGroup;Z)V

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    if-nez p1, :cond_2

    return-void

    .line 7070
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_3

    const/4 p1, 0x0

    .line 7071
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 7072
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 7074
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p1

    .line 7075
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 7076
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private ۙ(Ll/۫۟᩷;Z)V
    .locals 3

    .line 7632
    iget-object v0, p0, Ll/ۖ۟᩷;->᩸:Ll/ۡ۟᩷;

    if-eqz v0, :cond_1

    .line 6489
    iget-object v1, v0, Ll/ۡ۟᩷;->ۤ:Landroid/util/SparseArray;

    iget-object v0, v0, Ll/ۡ۟᩷;->᩷:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 6490
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result p1

    if-nez p1, :cond_1

    if-nez p2, :cond_1

    const/4 p1, 0x0

    .line 6491
    :goto_0
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result p2

    if-ge p1, p2, :cond_1

    .line 6492
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result p2

    invoke-virtual {v1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/֨۟᩷;

    iget-object p2, p2, Ll/֨۟᩷;->᩸:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 6493
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 6495
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧᩳ᩷;

    iget-object v2, v2, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    .line 6494
    invoke-static {v2}, Ll/ۢۙۙ;->ۙ(Landroid/view/View;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ۫()V
    .locals 2

    .line 7620
    iget-object v0, p0, Ll/ۖ۟᩷;->᩸:Ll/ۡ۟᩷;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۖ۟᩷;->ۚ:Ll/᩻ᩳ᩷;

    iget-object v1, v0, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    if-eqz v1, :cond_0

    .line 7622
    invoke-virtual {v0}, Ll/᩻ᩳ᩷;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7623
    iget-object v1, p0, Ll/ۖ۟᩷;->᩸:Ll/ۡ۟᩷;

    iget-object v0, v0, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    .line 6475
    iget-object v1, v1, Ll/ۡ۟᩷;->᩷:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final ۙ(I)I
    .locals 4

    .line 6823
    iget-object v0, p0, Ll/ۖ۟᩷;->ۚ:Ll/᩻ᩳ᩷;

    if-ltz p1, :cond_1

    iget-object v1, v0, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    invoke-virtual {v1}, Ll/ܳᩳ᩷;->ۙ()I

    move-result v1

    if-ge p1, v1, :cond_1

    .line 6827
    iget-object v1, v0, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    .line 13625
    iget-boolean v1, v1, Ll/ܳᩳ᩷;->ᩴ:Z

    if-nez v1, :cond_0

    return p1

    .line 6830
    :cond_0
    iget-object v0, v0, Ll/᩻ᩳ᩷;->mAdapterHelper:Ll/᩷ܿ᩷;

    const/4 v1, 0x0

    .line 468
    invoke-virtual {v0, p1, v1}, Ll/᩷ܿ᩷;->ۙ(II)I

    move-result p1

    return p1

    .line 6824
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "invalid position "

    const-string v3, ". State item count is "

    .line 0
    invoke-static {p1, v2, v3}, Ll/ۗ᩻ܺ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 6824
    iget-object v2, v0, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    .line 6825
    invoke-virtual {v2}, Ll/ܳᩳ᩷;->ۙ()I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ll/᩻ᩳ᩷;->exceptionLabel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ۙ()Ll/ۡ۟᩷;
    .locals 2

    .line 7649
    iget-object v0, p0, Ll/ۖ۟᩷;->᩸:Ll/ۡ۟᩷;

    if-nez v0, :cond_0

    .line 7650
    new-instance v0, Ll/ۡ۟᩷;

    .line 6282
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6306
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iput-object v1, v0, Ll/ۡ۟᩷;->ۤ:Landroid/util/SparseArray;

    const/4 v1, 0x0

    .line 6326
    iput v1, v0, Ll/ۡ۟᩷;->ۙ:I

    .line 6333
    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 6334
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v1

    iput-object v1, v0, Ll/ۡ۟᩷;->᩷:Ljava/util/Set;

    .line 7650
    iput-object v0, p0, Ll/ۖ۟᩷;->᩸:Ll/ۡ۟᩷;

    .line 7651
    invoke-direct {p0}, Ll/ۖ۟᩷;->۫()V

    .line 7653
    :cond_0
    iget-object v0, p0, Ll/ۖ۟᩷;->᩸:Ll/ۡ۟᩷;

    return-object v0
.end method

.method public final ۙ(IJ)Ll/ۧᩳ᩷;
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 6876
    iget-object v8, v0, Ll/ۖ۟᩷;->ۚ:Ll/᩻ᩳ᩷;

    if-ltz v1, :cond_3f

    iget-object v2, v8, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    invoke-virtual {v2}, Ll/ܳᩳ᩷;->ۙ()I

    move-result v2

    if-ge v1, v2, :cond_3f

    .line 6884
    iget-object v2, v8, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    .line 13625
    iget-boolean v2, v2, Ll/ܳᩳ᩷;->ᩴ:Z

    const/16 v3, 0x20

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v2, :cond_5

    .line 7360
    iget-object v2, v0, Ll/ۖ۟᩷;->ۤ:Ljava/util/ArrayList;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    .line 7365
    iget-object v5, v0, Ll/ۖ۟᩷;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۧᩳ᩷;

    .line 7366
    invoke-virtual {v5}, Ll/ۧᩳ᩷;->wasReturnedFromScrap()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {v5}, Ll/ۧᩳ᩷;->getLayoutPosition()I

    move-result v6

    if-ne v6, v1, :cond_1

    .line 7367
    invoke-virtual {v5, v3}, Ll/ۧᩳ᩷;->addFlags(I)V

    goto :goto_3

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 7372
    :cond_2
    iget-object v4, v8, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    invoke-virtual {v4}, Ll/۫۟᩷;->hasStableIds()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 7373
    iget-object v4, v8, Ll/᩻ᩳ᩷;->mAdapterHelper:Ll/᩷ܿ᩷;

    .line 468
    invoke-virtual {v4, v1, v11}, Ll/᩷ܿ᩷;->ۙ(II)I

    move-result v4

    if-lez v4, :cond_4

    .line 7374
    iget-object v5, v8, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    invoke-virtual {v5}, Ll/۫۟᩷;->getItemCount()I

    move-result v5

    if-ge v4, v5, :cond_4

    .line 7375
    iget-object v5, v8, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    invoke-virtual {v5, v4}, Ll/۫۟᩷;->getItemId(I)J

    move-result-wide v4

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v2, :cond_4

    .line 7377
    iget-object v7, v0, Ll/ۖ۟᩷;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۧᩳ᩷;

    .line 7378
    invoke-virtual {v7}, Ll/ۧᩳ᩷;->wasReturnedFromScrap()Z

    move-result v12

    if-nez v12, :cond_3

    invoke-virtual {v7}, Ll/ۧᩳ᩷;->getItemId()J

    move-result-wide v12

    cmp-long v14, v12, v4

    if-nez v14, :cond_3

    .line 7379
    invoke-virtual {v7, v3}, Ll/ۧᩳ᩷;->addFlags(I)V

    move-object v5, v7

    goto :goto_3

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    move-object v5, v9

    :goto_3
    if-eqz v5, :cond_6

    const/4 v2, 0x1

    goto :goto_4

    :cond_5
    move-object v5, v9

    :cond_6
    const/4 v2, 0x0

    .line 6889
    :goto_4
    iget-object v4, v0, Ll/ۖ۟᩷;->ۙ:Ljava/util/ArrayList;

    iget-object v6, v0, Ll/ۖ۟᩷;->᩷:Ljava/util/ArrayList;

    if-nez v5, :cond_1b

    .line 7396
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v7, 0x0

    :goto_5
    if-ge v7, v5, :cond_9

    .line 7400
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۧᩳ᩷;

    .line 7401
    invoke-virtual {v12}, Ll/ۧᩳ᩷;->wasReturnedFromScrap()Z

    move-result v13

    if-nez v13, :cond_8

    invoke-virtual {v12}, Ll/ۧᩳ᩷;->getLayoutPosition()I

    move-result v13

    if-ne v13, v1, :cond_8

    .line 7402
    invoke-virtual {v12}, Ll/ۧᩳ᩷;->isInvalid()Z

    move-result v13

    if-nez v13, :cond_8

    iget-object v13, v8, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    iget-boolean v13, v13, Ll/ܳᩳ᩷;->ᩴ:Z

    if-nez v13, :cond_7

    invoke-virtual {v12}, Ll/ۧᩳ᩷;->isRemoved()Z

    move-result v13

    if-nez v13, :cond_8

    .line 7403
    :cond_7
    invoke-virtual {v12, v3}, Ll/ۧᩳ᩷;->addFlags(I)V

    goto/16 :goto_9

    :cond_8
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    .line 7409
    :cond_9
    iget-object v5, v8, Ll/᩻ᩳ᩷;->mChildHelper:Ll/ܳܿ᩷;

    .line 254
    iget-object v5, v5, Ll/ܳܿ᩷;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v12, 0x0

    :goto_6
    if-ge v12, v7, :cond_b

    .line 256
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/view/View;

    .line 1043
    invoke-static {v13}, Ll/᩻ᩳ᩷;->᩷(Landroid/view/View;)Ll/ۧᩳ᩷;

    move-result-object v14

    .line 258
    invoke-virtual {v14}, Ll/ۧᩳ᩷;->getLayoutPosition()I

    move-result v15

    if-ne v15, v1, :cond_a

    .line 259
    invoke-virtual {v14}, Ll/ۧᩳ᩷;->isInvalid()Z

    move-result v15

    if-nez v15, :cond_a

    .line 260
    invoke-virtual {v14}, Ll/ۧᩳ᩷;->isRemoved()Z

    move-result v14

    if-nez v14, :cond_a

    goto :goto_7

    :cond_a
    add-int/lit8 v12, v12, 0x1

    goto :goto_6

    :cond_b
    move-object v13, v9

    :goto_7
    if-eqz v13, :cond_d

    .line 7413
    invoke-static {v13}, Ll/᩻ᩳ᩷;->᩷(Landroid/view/View;)Ll/ۧᩳ᩷;

    move-result-object v5

    .line 7414
    iget-object v7, v8, Ll/᩻ᩳ᩷;->mChildHelper:Ll/ܳܿ᩷;

    invoke-virtual {v7, v13}, Ll/ܳܿ᩷;->ᩴ(Landroid/view/View;)V

    .line 7415
    iget-object v7, v8, Ll/᩻ᩳ᩷;->mChildHelper:Ll/ܳܿ᩷;

    invoke-virtual {v7, v13}, Ll/ܳܿ᩷;->᩷(Landroid/view/View;)I

    move-result v7

    const/4 v12, -0x1

    if-eq v7, v12, :cond_c

    .line 7420
    iget-object v12, v8, Ll/᩻ᩳ᩷;->mChildHelper:Ll/ܳܿ᩷;

    invoke-virtual {v12, v7}, Ll/ܳܿ᩷;->ۙ(I)V

    .line 7421
    invoke-virtual {v0, v13}, Ll/ۖ۟᩷;->᩷(Landroid/view/View;)V

    const/16 v7, 0x2020

    .line 7422
    invoke-virtual {v5, v7}, Ll/ۧᩳ᩷;->addFlags(I)V

    goto :goto_a

    .line 7417
    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "layout index should not be -1 after unhiding a view:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7418
    invoke-virtual {v8}, Ll/᩻ᩳ᩷;->exceptionLabel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 7429
    :cond_d
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v7, 0x0

    :goto_8
    if-ge v7, v5, :cond_10

    .line 7431
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۧᩳ᩷;

    .line 7434
    invoke-virtual {v12}, Ll/ۧᩳ᩷;->isInvalid()Z

    move-result v13

    if-nez v13, :cond_f

    invoke-virtual {v12}, Ll/ۧᩳ᩷;->getLayoutPosition()I

    move-result v13

    if-ne v13, v1, :cond_f

    .line 7435
    invoke-virtual {v12}, Ll/ۧᩳ᩷;->isAttachedToTransitionOverlay()Z

    move-result v13

    if-nez v13, :cond_f

    .line 7437
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 7439
    sget-boolean v5, Ll/᩻ᩳ᩷;->sVerboseLoggingEnabled:Z

    if-eqz v5, :cond_e

    .line 7440
    invoke-virtual {v12}, Ll/ۧᩳ᩷;->toString()Ljava/lang/String;

    :cond_e
    :goto_9
    move-object v5, v12

    goto :goto_a

    :cond_f
    add-int/lit8 v7, v7, 0x1

    goto :goto_8

    :cond_10
    move-object v5, v9

    :goto_a
    if-eqz v5, :cond_1b

    .line 6677
    invoke-virtual {v5}, Ll/ۧᩳ᩷;->isRemoved()Z

    move-result v7

    if-eqz v7, :cond_13

    .line 6678
    sget-boolean v7, Ll/᩻ᩳ᩷;->sDebugAssertionsEnabled:Z

    if-eqz v7, :cond_12

    iget-object v7, v8, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    .line 13625
    iget-boolean v7, v7, Ll/ܳᩳ᩷;->ᩴ:Z

    if-eqz v7, :cond_11

    goto :goto_b

    .line 6679
    :cond_11
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "should not receive a removed view unless it is pre layout"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6680
    invoke-virtual {v8}, Ll/᩻ᩳ᩷;->exceptionLabel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 6682
    :cond_12
    :goto_b
    iget-object v7, v8, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    .line 13625
    iget-boolean v7, v7, Ll/ܳᩳ᩷;->ᩴ:Z

    goto :goto_e

    .line 6684
    :cond_13
    iget v7, v5, Ll/ۧᩳ᩷;->mPosition:I

    if-ltz v7, :cond_1a

    iget-object v12, v8, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    invoke-virtual {v12}, Ll/۫۟᩷;->getItemCount()I

    move-result v12

    if-ge v7, v12, :cond_1a

    .line 6688
    iget-object v7, v8, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    .line 13625
    iget-boolean v7, v7, Ll/ܳᩳ᩷;->ᩴ:Z

    if-nez v7, :cond_14

    .line 6690
    iget-object v7, v8, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    iget v12, v5, Ll/ۧᩳ᩷;->mPosition:I

    invoke-virtual {v7, v12}, Ll/۫۟᩷;->getItemViewType(I)I

    move-result v7

    .line 6691
    invoke-virtual {v5}, Ll/ۧᩳ᩷;->getItemViewType()I

    move-result v12

    if-eq v7, v12, :cond_14

    goto :goto_c

    .line 6695
    :cond_14
    iget-object v7, v8, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    invoke-virtual {v7}, Ll/۫۟᩷;->hasStableIds()Z

    move-result v7

    if-eqz v7, :cond_16

    .line 6696
    invoke-virtual {v5}, Ll/ۧᩳ᩷;->getItemId()J

    move-result-wide v12

    iget-object v7, v8, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    iget v14, v5, Ll/ۧᩳ᩷;->mPosition:I

    invoke-virtual {v7, v14}, Ll/۫۟᩷;->getItemId(I)J

    move-result-wide v14

    cmp-long v7, v12, v14

    if-nez v7, :cond_15

    goto :goto_d

    :cond_15
    :goto_c
    const/4 v7, 0x0

    goto :goto_e

    :cond_16
    :goto_d
    const/4 v7, 0x1

    :goto_e
    if-nez v7, :cond_19

    const/4 v7, 0x4

    .line 6897
    invoke-virtual {v5, v7}, Ll/ۧᩳ᩷;->addFlags(I)V

    .line 6898
    invoke-virtual {v5}, Ll/ۧᩳ᩷;->isScrap()Z

    move-result v7

    if-eqz v7, :cond_17

    .line 6899
    iget-object v7, v5, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {v8, v7, v11}, Ll/᩻ᩳ᩷;->removeDetachedView(Landroid/view/View;Z)V

    .line 6900
    invoke-virtual {v5}, Ll/ۧᩳ᩷;->unScrap()V

    goto :goto_f

    .line 6901
    :cond_17
    invoke-virtual {v5}, Ll/ۧᩳ᩷;->wasReturnedFromScrap()Z

    move-result v7

    if-eqz v7, :cond_18

    .line 6902
    invoke-virtual {v5}, Ll/ۧᩳ᩷;->clearReturnedFromScrapFlag()V

    .line 6904
    :cond_18
    :goto_f
    invoke-virtual {v0, v5}, Ll/ۖ۟᩷;->ۙ(Ll/ۧᩳ᩷;)V

    move-object v5, v9

    goto :goto_10

    :cond_19
    const/4 v2, 0x1

    goto :goto_10

    .line 6685
    :cond_1a
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Inconsistency detected. Invalid view holder adapter position"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 6686
    invoke-virtual {v8}, Ll/᩻ᩳ᩷;->exceptionLabel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1b
    :goto_10
    if-nez v5, :cond_2c

    .line 6913
    iget-object v7, v8, Ll/᩻ᩳ᩷;->mAdapterHelper:Ll/᩷ܿ᩷;

    .line 468
    invoke-virtual {v7, v1, v11}, Ll/᩷ܿ᩷;->ۙ(II)I

    move-result v7

    if-ltz v7, :cond_2b

    .line 6914
    iget-object v12, v8, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    invoke-virtual {v12}, Ll/۫۟᩷;->getItemCount()I

    move-result v12

    if-ge v7, v12, :cond_2b

    .line 6920
    iget-object v12, v8, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    invoke-virtual {v12, v7}, Ll/۫۟᩷;->getItemViewType(I)I

    move-result v12

    .line 6922
    iget-object v13, v8, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    invoke-virtual {v13}, Ll/۫۟᩷;->hasStableIds()Z

    move-result v13

    if-eqz v13, :cond_23

    .line 6923
    iget-object v5, v8, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    invoke-virtual {v5, v7}, Ll/۫۟᩷;->getItemId(I)J

    move-result-wide v13

    .line 7451
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    sub-int/2addr v5, v10

    :goto_11
    if-ltz v5, :cond_1f

    .line 7453
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    const-wide v16, 0x7fffffffffffffffL

    check-cast v15, Ll/ۧᩳ᩷;

    .line 7454
    invoke-virtual {v15}, Ll/ۧᩳ᩷;->getItemId()J

    move-result-wide v18

    cmp-long v20, v18, v13

    if-nez v20, :cond_1e

    invoke-virtual {v15}, Ll/ۧᩳ᩷;->wasReturnedFromScrap()Z

    move-result v18

    if-nez v18, :cond_1e

    .line 7455
    invoke-virtual {v15}, Ll/ۧᩳ᩷;->getItemViewType()I

    move-result v10

    if-ne v12, v10, :cond_1d

    .line 7456
    invoke-virtual {v15, v3}, Ll/ۧᩳ᩷;->addFlags(I)V

    .line 7457
    invoke-virtual {v15}, Ll/ۧᩳ᩷;->isRemoved()Z

    move-result v3

    if-eqz v3, :cond_1c

    .line 7466
    iget-object v3, v8, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    .line 13625
    iget-boolean v3, v3, Ll/ܳᩳ᩷;->ᩴ:Z

    if-nez v3, :cond_1c

    const/4 v3, 0x2

    const/16 v4, 0xe

    .line 7467
    invoke-virtual {v15, v3, v4}, Ll/ۧᩳ᩷;->setFlags(II)V

    :cond_1c
    move-object v5, v15

    goto :goto_14

    .line 7476
    :cond_1d
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 7477
    iget-object v10, v15, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {v8, v10, v11}, Ll/᩻ᩳ᩷;->removeDetachedView(Landroid/view/View;Z)V

    .line 7478
    iget-object v10, v15, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    .line 7289
    invoke-static {v10}, Ll/᩻ᩳ᩷;->᩷(Landroid/view/View;)Ll/ۧᩳ᩷;

    move-result-object v10

    .line 7290
    iput-object v9, v10, Ll/ۧᩳ᩷;->mScrapContainer:Ll/ۖ۟᩷;

    .line 7291
    iput-boolean v11, v10, Ll/ۧᩳ᩷;->mInChangeScrap:Z

    .line 7292
    invoke-virtual {v10}, Ll/ۧᩳ᩷;->clearReturnedFromScrapFlag()V

    .line 7293
    invoke-virtual {v0, v10}, Ll/ۖ۟᩷;->ۙ(Ll/ۧᩳ᩷;)V

    :cond_1e
    add-int/lit8 v5, v5, -0x1

    const/4 v10, 0x1

    goto :goto_11

    :cond_1f
    const-wide v16, 0x7fffffffffffffffL

    .line 7484
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    :goto_12
    if-ltz v3, :cond_22

    .line 7486
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۧᩳ᩷;

    .line 7487
    invoke-virtual {v4}, Ll/ۧᩳ᩷;->getItemId()J

    move-result-wide v19

    cmp-long v5, v19, v13

    if-nez v5, :cond_21

    invoke-virtual {v4}, Ll/ۧᩳ᩷;->isAttachedToTransitionOverlay()Z

    move-result v5

    if-nez v5, :cond_21

    .line 7488
    invoke-virtual {v4}, Ll/ۧᩳ᩷;->getItemViewType()I

    move-result v5

    if-ne v12, v5, :cond_20

    .line 7490
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-object v5, v4

    goto :goto_14

    .line 7494
    :cond_20
    invoke-virtual {v0, v3}, Ll/ۖ۟᩷;->ۤ(I)V

    goto :goto_13

    :cond_21
    add-int/lit8 v3, v3, -0x1

    goto :goto_12

    :cond_22
    :goto_13
    move-object v5, v9

    :goto_14
    if-eqz v5, :cond_24

    .line 6927
    iput v7, v5, Ll/ۧᩳ᩷;->mPosition:I

    const/4 v2, 0x1

    const/4 v10, 0x1

    goto :goto_15

    :cond_23
    const-wide v16, 0x7fffffffffffffffL

    :cond_24
    move v10, v2

    :goto_15
    if-nez v5, :cond_28

    .line 6950
    sget v2, Ll/᩻ᩳ᩷;->HORIZONTAL:I

    .line 6954
    invoke-virtual/range {p0 .. p0}, Ll/ۖ۟᩷;->ۙ()Ll/ۡ۟᩷;

    move-result-object v2

    .line 6381
    iget-object v2, v2, Ll/ۡ۟᩷;->ۤ:Landroid/util/SparseArray;

    invoke-virtual {v2, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨۟᩷;

    if-eqz v2, :cond_26

    .line 6382
    iget-object v2, v2, Ll/֨۟᩷;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_26

    .line 6384
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    :goto_16
    if-ltz v3, :cond_26

    .line 6385
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۧᩳ᩷;

    invoke-virtual {v4}, Ll/ۧᩳ᩷;->isAttachedToTransitionOverlay()Z

    move-result v4

    if-nez v4, :cond_25

    .line 6386
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧᩳ᩷;

    goto :goto_17

    :cond_25
    add-int/lit8 v3, v3, -0x1

    goto :goto_16

    :cond_26
    move-object v2, v9

    :goto_17
    if-eqz v2, :cond_27

    .line 6956
    invoke-virtual {v2}, Ll/ۧᩳ᩷;->resetInternal()V

    .line 6957
    sget-boolean v3, Ll/᩻ᩳ᩷;->FORCE_INVALIDATE_DISPLAY_LIST:Z

    if-eqz v3, :cond_27

    .line 7054
    iget-object v3, v2, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    instance-of v4, v3, Landroid/view/ViewGroup;

    if-eqz v4, :cond_27

    .line 7055
    check-cast v3, Landroid/view/ViewGroup;

    invoke-static {v3, v11}, Ll/ۖ۟᩷;->ۙ(Landroid/view/ViewGroup;Z)V

    :cond_27
    move-object v5, v2

    :cond_28
    if-nez v5, :cond_2d

    .line 6963
    invoke-virtual {v8}, Ll/᩻ᩳ᩷;->getNanoTime()J

    move-result-wide v13

    cmp-long v2, p2, v16

    if-eqz v2, :cond_29

    .line 6964
    iget-object v2, v0, Ll/ۖ۟᩷;->᩸:Ll/ۡ۟᩷;

    move-wide v3, v13

    move v5, v12

    move-wide/from16 v6, p2

    .line 6965
    invoke-virtual/range {v2 .. v7}, Ll/ۡ۟᩷;->᩷(JIJ)Z

    move-result v2

    if-nez v2, :cond_29

    return-object v9

    .line 6969
    :cond_29
    iget-object v2, v8, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    invoke-virtual {v2, v8, v12}, Ll/۫۟᩷;->createViewHolder(Landroid/view/ViewGroup;I)Ll/ۧᩳ᩷;

    move-result-object v5

    .line 6970
    sget-boolean v2, Ll/᩻ᩳ᩷;->ALLOW_THREAD_GAP_WORK:Z

    if-eqz v2, :cond_2a

    .line 6972
    iget-object v2, v5, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-static {v2}, Ll/᩻ᩳ᩷;->ۙ(Landroid/view/View;)Ll/᩻ᩳ᩷;

    move-result-object v2

    if-eqz v2, :cond_2a

    .line 6974
    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v3, v5, Ll/ۧᩳ᩷;->mNestedRecyclerView:Ljava/lang/ref/WeakReference;

    .line 6978
    :cond_2a
    invoke-virtual {v8}, Ll/᩻ᩳ᩷;->getNanoTime()J

    move-result-wide v2

    .line 6979
    iget-object v4, v0, Ll/ۖ۟᩷;->᩸:Ll/ۡ۟᩷;

    sub-long/2addr v2, v13

    invoke-virtual {v4, v12, v2, v3}, Ll/ۡ۟᩷;->᩷(IJ)V

    goto :goto_18

    .line 6915
    :cond_2b
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    const-string v3, "(offset:"

    const-string v4, ").state:"

    const-string v5, "Inconsistency detected. Invalid item position "

    .line 0
    invoke-static {v5, v1, v3, v4, v7}, Ll/֨᩵ᩴ;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 6915
    iget-object v3, v8, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    .line 6917
    invoke-virtual {v3}, Ll/ܳᩳ᩷;->ۙ()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ll/᩻ᩳ᩷;->exceptionLabel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_2c
    const-wide v16, 0x7fffffffffffffffL

    move v10, v2

    :cond_2d
    :goto_18
    move-object v12, v5

    if-eqz v10, :cond_2e

    .line 6989
    iget-object v2, v8, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    .line 13625
    iget-boolean v2, v2, Ll/ܳᩳ᩷;->ᩴ:Z

    if-nez v2, :cond_2e

    const/16 v2, 0x2000

    .line 6990
    invoke-virtual {v12, v2}, Ll/ۧᩳ᩷;->hasAnyOfTheFlags(I)Z

    move-result v3

    if-eqz v3, :cond_2e

    .line 6991
    invoke-virtual {v12, v11, v2}, Ll/ۧᩳ᩷;->setFlags(II)V

    .line 6992
    iget-object v2, v8, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    iget-boolean v2, v2, Ll/ܳᩳ᩷;->᩻:Z

    if-eqz v2, :cond_2e

    .line 6994
    invoke-static {v12}, Ll/ۗ۟᩷;->ۤ(Ll/ۧᩳ᩷;)V

    .line 6996
    iget-object v2, v8, Ll/᩻ᩳ᩷;->mItemAnimator:Ll/ۗ۟᩷;

    .line 6997
    invoke-virtual {v12}, Ll/ۧᩳ᩷;->getUnmodifiedPayloads()Ljava/util/List;

    .line 6996
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14494
    new-instance v2, Ll/᩹۟᩷;

    .line 14561
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 14056
    invoke-virtual {v2, v12}, Ll/᩹۟᩷;->ۙ(Ll/ۧᩳ᩷;)V

    .line 6998
    invoke-virtual {v8, v12, v2}, Ll/᩻ᩳ᩷;->recordAnimationInfoIfBouncedHiddenView(Ll/ۧᩳ᩷;Ll/᩹۟᩷;)V

    .line 7003
    :cond_2e
    iget-object v2, v8, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    .line 13625
    iget-boolean v2, v2, Ll/ܳᩳ᩷;->ᩴ:Z

    if-eqz v2, :cond_2f

    .line 7003
    invoke-virtual {v12}, Ll/ۧᩳ᩷;->isBound()Z

    move-result v2

    if-eqz v2, :cond_2f

    .line 7005
    iput v1, v12, Ll/ۧᩳ᩷;->mPreLayoutPosition:I

    goto :goto_1a

    .line 7006
    :cond_2f
    invoke-virtual {v12}, Ll/ۧᩳ᩷;->isBound()Z

    move-result v2

    if-eqz v2, :cond_30

    invoke-virtual {v12}, Ll/ۧᩳ᩷;->needsUpdate()Z

    move-result v2

    if-nez v2, :cond_30

    invoke-virtual {v12}, Ll/ۧᩳ᩷;->isInvalid()Z

    move-result v2

    if-eqz v2, :cond_33

    .line 7007
    :cond_30
    sget-boolean v2, Ll/᩻ᩳ᩷;->sDebugAssertionsEnabled:Z

    if-eqz v2, :cond_32

    invoke-virtual {v12}, Ll/ۧᩳ᩷;->isRemoved()Z

    move-result v2

    if-nez v2, :cond_31

    goto :goto_19

    .line 7008
    :cond_31
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Removed holder should be bound and it should come here only in pre-layout. Holder: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7010
    invoke-virtual {v8}, Ll/᩻ᩳ᩷;->exceptionLabel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 7012
    :cond_32
    :goto_19
    iget-object v2, v8, Ll/᩻ᩳ᩷;->mAdapterHelper:Ll/᩷ܿ᩷;

    .line 468
    invoke-virtual {v2, v1, v11}, Ll/᩷ܿ᩷;->ۙ(II)I

    move-result v11

    .line 6715
    iput-object v9, v12, Ll/ۧᩳ᩷;->mBindingAdapter:Ll/۫۟᩷;

    .line 6716
    iput-object v8, v12, Ll/ۧᩳ᩷;->mOwnerRecyclerView:Ll/᩻ᩳ᩷;

    .line 6717
    invoke-virtual {v12}, Ll/ۧᩳ᩷;->getItemViewType()I

    move-result v5

    .line 6718
    invoke-virtual {v8}, Ll/᩻ᩳ᩷;->getNanoTime()J

    move-result-wide v13

    cmp-long v2, p2, v16

    if-eqz v2, :cond_34

    .line 6719
    iget-object v2, v0, Ll/ۖ۟᩷;->᩸:Ll/ۡ۟᩷;

    move-wide v3, v13

    move-wide/from16 v6, p2

    .line 6720
    invoke-virtual/range {v2 .. v7}, Ll/ۡ۟᩷;->ۙ(JIJ)Z

    move-result v2

    if-nez v2, :cond_34

    :cond_33
    :goto_1a
    const/4 v1, 0x0

    const/4 v3, 0x1

    goto :goto_1e

    .line 6736
    :cond_34
    invoke-virtual {v12}, Ll/ۧᩳ᩷;->isTmpDetached()Z

    move-result v2

    if-eqz v2, :cond_35

    .line 6737
    iget-object v2, v12, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {v8}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    iget-object v4, v12, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    .line 6738
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    .line 6737
    invoke-static {v8, v2, v3, v4}, Ll/᩻ᩳ᩷;->᩷(Ll/᩻ᩳ᩷;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    const/4 v2, 0x1

    goto :goto_1b

    :cond_35
    const/4 v2, 0x0

    .line 6742
    :goto_1b
    iget-object v3, v8, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    invoke-virtual {v3, v12, v11}, Ll/۫۟᩷;->bindViewHolder(Ll/ۧᩳ᩷;I)V

    if-eqz v2, :cond_36

    .line 6745
    iget-object v2, v12, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-static {v8, v2}, Ll/᩻ᩳ᩷;->ۙ(Ll/᩻ᩳ᩷;Landroid/view/View;)V

    .line 6748
    :cond_36
    invoke-virtual {v8}, Ll/᩻ᩳ᩷;->getNanoTime()J

    move-result-wide v2

    .line 6749
    iget-object v4, v0, Ll/ۖ۟᩷;->᩸:Ll/ۡ۟᩷;

    invoke-virtual {v12}, Ll/ۧᩳ᩷;->getItemViewType()I

    move-result v5

    sub-long/2addr v2, v13

    invoke-virtual {v4, v5, v2, v3}, Ll/ۡ۟᩷;->ۙ(IJ)V

    .line 7033
    invoke-virtual {v8}, Ll/᩻ᩳ᩷;->isAccessibilityEnabled()Z

    move-result v2

    if-eqz v2, :cond_3a

    .line 7034
    iget-object v2, v12, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    .line 7035
    invoke-virtual {v2}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v3

    if-nez v3, :cond_37

    const/4 v3, 0x1

    .line 7037
    invoke-virtual {v2, v3}, Landroid/view/View;->setImportantForAccessibility(I)V

    goto :goto_1c

    :cond_37
    const/4 v3, 0x1

    .line 7039
    :goto_1c
    iget-object v4, v8, Ll/᩻ᩳ᩷;->mAccessibilityDelegate:Ll/ܽᩳ᩷;

    if-nez v4, :cond_38

    goto :goto_1d

    .line 7042
    :cond_38
    invoke-virtual {v4}, Ll/ܽᩳ᩷;->getItemDelegate()Ll/᩸ۡ;

    move-result-object v4

    .line 7043
    instance-of v5, v4, Ll/ܺᩳ᩷;

    if-eqz v5, :cond_39

    .line 7046
    move-object v5, v4

    check-cast v5, Ll/ܺᩳ᩷;

    .line 7047
    invoke-virtual {v5, v2}, Ll/ܺᩳ᩷;->ۤ(Landroid/view/View;)V

    .line 7049
    :cond_39
    invoke-static {v2, v4}, Ll/᩸۠;->ۙ(Landroid/view/View;Ll/᩸ۡ;)V

    goto :goto_1d

    :cond_3a
    const/4 v3, 0x1

    .line 6751
    :goto_1d
    iget-object v2, v8, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    .line 13625
    iget-boolean v2, v2, Ll/ܳᩳ᩷;->ᩴ:Z

    if-eqz v2, :cond_3b

    .line 6752
    iput v1, v12, Ll/ۧᩳ᩷;->mPreLayoutPosition:I

    :cond_3b
    const/4 v1, 0x1

    .line 7016
    :goto_1e
    iget-object v2, v12, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    if-nez v2, :cond_3c

    .line 7019
    invoke-virtual {v8}, Ll/᩻ᩳ᩷;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Ll/ܿ۟᩷;

    .line 7020
    iget-object v4, v12, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {v4, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1f

    .line 7021
    :cond_3c
    invoke-virtual {v8, v2}, Ll/᩻ᩳ᩷;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v4

    if-nez v4, :cond_3d

    .line 7022
    invoke-virtual {v8, v2}, Ll/᩻ᩳ᩷;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Ll/ܿ۟᩷;

    .line 7023
    iget-object v4, v12, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {v4, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1f

    .line 7025
    :cond_3d
    check-cast v2, Ll/ܿ۟᩷;

    .line 7027
    :goto_1f
    iput-object v12, v2, Ll/ܿ۟᩷;->᩸:Ll/ۧᩳ᩷;

    if-eqz v10, :cond_3e

    if-eqz v1, :cond_3e

    const/4 v10, 0x1

    goto :goto_20

    :cond_3e
    const/4 v10, 0x0

    .line 7028
    :goto_20
    iput-boolean v10, v2, Ll/ܿ۟᩷;->ۤ:Z

    return-object v12

    .line 6877
    :cond_3f
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    const-string v3, "("

    const-string v4, "). Item count:"

    const-string v5, "Invalid item position "

    .line 0
    invoke-static {v5, v1, v3, v4, v1}, Ll/֨᩵ᩴ;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 6877
    iget-object v3, v8, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    .line 6878
    invoke-virtual {v3}, Ll/ܳᩳ᩷;->ۙ()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 6879
    invoke-virtual {v8}, Ll/᩻ᩳ᩷;->exceptionLabel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final ۙ(Landroid/view/View;)V
    .locals 3

    .line 7093
    invoke-static {p1}, Ll/᩻ᩳ᩷;->᩷(Landroid/view/View;)Ll/ۧᩳ᩷;

    move-result-object v0

    .line 7094
    invoke-virtual {v0}, Ll/ۧᩳ᩷;->isTmpDetached()Z

    move-result v1

    iget-object v2, p0, Ll/ۖ۟᩷;->ۚ:Ll/᩻ᩳ᩷;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 7095
    invoke-virtual {v2, p1, v1}, Ll/᩻ᩳ᩷;->removeDetachedView(Landroid/view/View;Z)V

    .line 7097
    :cond_0
    invoke-virtual {v0}, Ll/ۧᩳ᩷;->isScrap()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 7098
    invoke-virtual {v0}, Ll/ۧᩳ᩷;->unScrap()V

    goto :goto_0

    .line 7099
    :cond_1
    invoke-virtual {v0}, Ll/ۧᩳ᩷;->wasReturnedFromScrap()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 7100
    invoke-virtual {v0}, Ll/ۧᩳ᩷;->clearReturnedFromScrapFlag()V

    .line 7102
    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Ll/ۖ۟᩷;->ۙ(Ll/ۧᩳ᩷;)V

    .line 7121
    iget-object p1, v2, Ll/᩻ᩳ᩷;->mItemAnimator:Ll/ۗ۟᩷;

    if-eqz p1, :cond_3

    invoke-virtual {v0}, Ll/ۧᩳ᩷;->isRecyclable()Z

    move-result p1

    if-nez p1, :cond_3

    .line 7122
    iget-object p1, v2, Ll/᩻ᩳ᩷;->mItemAnimator:Ll/ۗ۟᩷;

    invoke-virtual {p1, v0}, Ll/ۗ۟᩷;->᩷(Ll/ۧᩳ᩷;)V

    :cond_3
    return-void
.end method

.method public final ۙ(Ll/ۡ۟᩷;)V
    .locals 3

    .line 7608
    iget-object v0, p0, Ll/ۖ۟᩷;->ۚ:Ll/᩻ᩳ᩷;

    iget-object v1, v0, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    const/4 v2, 0x0

    .line 7628
    invoke-direct {p0, v1, v2}, Ll/ۖ۟᩷;->ۙ(Ll/۫۟᩷;Z)V

    .line 7609
    iget-object v1, p0, Ll/ۖ۟᩷;->᩸:Ll/ۡ۟᩷;

    if-eqz v1, :cond_0

    .line 6464
    iget v2, v1, Ll/ۡ۟᩷;->ۙ:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v1, Ll/ۡ۟᩷;->ۙ:I

    .line 7612
    :cond_0
    iput-object p1, p0, Ll/ۖ۟᩷;->᩸:Ll/ۡ۟᩷;

    if-eqz p1, :cond_1

    .line 7613
    invoke-virtual {v0}, Ll/᩻ᩳ᩷;->getAdapter()Ll/۫۟᩷;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 7614
    iget-object p1, p0, Ll/ۖ۟᩷;->᩸:Ll/ۡ۟᩷;

    .line 6460
    iget v0, p1, Ll/ۡ۟᩷;->ۙ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Ll/ۡ۟᩷;->ۙ:I

    .line 7616
    :cond_1
    invoke-direct {p0}, Ll/ۖ۟᩷;->۫()V

    return-void
.end method

.method public final ۙ(Ll/ۧᩳ᩷;)V
    .locals 10

    .line 7166
    invoke-virtual {p1}, Ll/ۧᩳ᩷;->isScrap()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget-object v3, p0, Ll/ۖ۟᩷;->ۚ:Ll/᩻ᩳ᩷;

    if-nez v0, :cond_11

    iget-object v0, p1, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    goto/16 :goto_a

    .line 7173
    :cond_0
    invoke-virtual {p1}, Ll/ۧᩳ᩷;->isTmpDetached()Z

    move-result v0

    if-nez v0, :cond_10

    .line 7179
    invoke-virtual {p1}, Ll/ۧᩳ᩷;->shouldIgnore()Z

    move-result v0

    if-nez v0, :cond_f

    .line 7185
    invoke-virtual {p1}, Ll/ۧᩳ᩷;->doesTransientStatePreventRecycling()Z

    move-result v0

    .line 7186
    iget-object v4, v3, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    if-eqz v4, :cond_1

    if-eqz v0, :cond_1

    .line 7188
    invoke-virtual {v4, p1}, Ll/۫۟᩷;->onFailedToRecycleView(Ll/ۧᩳ᩷;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    .line 7191
    :goto_0
    sget-boolean v5, Ll/᩻ᩳ᩷;->sDebugAssertionsEnabled:Z

    iget-object v6, p0, Ll/ۖ۟᩷;->᩷:Ljava/util/ArrayList;

    if-eqz v5, :cond_3

    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_1

    .line 7192
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "cached view received recycle internal? "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7193
    invoke-virtual {v3}, Ll/᩻ᩳ᩷;->exceptionLabel()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    if-nez v4, :cond_5

    .line 7195
    invoke-virtual {p1}, Ll/ۧᩳ᩷;->isRecyclable()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_2

    .line 7237
    :cond_4
    sget-boolean v2, Ll/᩻ᩳ᩷;->sVerboseLoggingEnabled:Z

    if-eqz v2, :cond_d

    .line 7240
    invoke-virtual {v3}, Ll/᩻ᩳ᩷;->exceptionLabel()Ljava/lang/String;

    goto/16 :goto_8

    .line 7196
    :cond_5
    :goto_2
    iget v4, p0, Ll/ۖ۟᩷;->۫:I

    if-lez v4, :cond_c

    const/16 v4, 0x20e

    .line 7197
    invoke-virtual {p1, v4}, Ll/ۧᩳ᩷;->hasAnyOfTheFlags(I)Z

    move-result v4

    if-nez v4, :cond_c

    .line 7202
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 7203
    iget v5, p0, Ll/ۖ۟᩷;->۫:I

    if-lt v4, v5, :cond_6

    if-lez v4, :cond_6

    .line 7204
    invoke-virtual {p0, v1}, Ll/ۖ۟᩷;->ۤ(I)V

    add-int/lit8 v4, v4, -0x1

    .line 7209
    :cond_6
    sget-boolean v1, Ll/᩻ᩳ᩷;->ALLOW_THREAD_GAP_WORK:Z

    if-eqz v1, :cond_b

    if-lez v4, :cond_b

    iget-object v1, v3, Ll/᩻ᩳ᩷;->mPrefetchRegistry:Ll/ۜܿ᩷;

    iget v5, p1, Ll/ۧᩳ᩷;->mPosition:I

    .line 140
    iget-object v7, v1, Ll/ۜܿ᩷;->᩷:[I

    if-eqz v7, :cond_8

    .line 141
    iget v7, v1, Ll/ۜܿ᩷;->ۙ:I

    mul-int/lit8 v7, v7, 0x2

    const/4 v8, 0x0

    :goto_3
    if-ge v8, v7, :cond_8

    .line 143
    iget-object v9, v1, Ll/ۜܿ᩷;->᩷:[I

    aget v9, v9, v8

    if-ne v9, v5, :cond_7

    goto :goto_6

    :cond_7
    add-int/lit8 v8, v8, 0x2

    goto :goto_3

    :cond_8
    :goto_4
    add-int/lit8 v4, v4, -0x1

    if-ltz v4, :cond_a

    .line 7215
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧᩳ᩷;

    iget v1, v1, Ll/ۧᩳ᩷;->mPosition:I

    .line 7216
    iget-object v5, v3, Ll/᩻ᩳ᩷;->mPrefetchRegistry:Ll/ۜܿ᩷;

    .line 140
    iget-object v7, v5, Ll/ۜܿ᩷;->᩷:[I

    if-eqz v7, :cond_a

    .line 141
    iget v7, v5, Ll/ۜܿ᩷;->ۙ:I

    mul-int/lit8 v7, v7, 0x2

    const/4 v8, 0x0

    :goto_5
    if-ge v8, v7, :cond_a

    .line 143
    iget-object v9, v5, Ll/ۜܿ᩷;->᩷:[I

    aget v9, v9, v8

    if-ne v9, v1, :cond_9

    goto :goto_4

    :cond_9
    add-int/lit8 v8, v8, 0x2

    goto :goto_5

    :cond_a
    add-int/2addr v4, v2

    .line 7223
    :cond_b
    :goto_6
    invoke-virtual {v6, v4, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const/4 v1, 0x1

    goto :goto_7

    :cond_c
    const/4 v1, 0x0

    :goto_7
    if-nez v1, :cond_d

    .line 7227
    invoke-virtual {p0, p1, v2}, Ll/ۖ۟᩷;->ۙ(Ll/ۧᩳ᩷;Z)V

    goto :goto_9

    :cond_d
    :goto_8
    const/4 v2, 0x0

    .line 7245
    :goto_9
    iget-object v3, v3, Ll/᩻ᩳ᩷;->mViewInfoStore:Ll/۬ᩳ᩷;

    invoke-virtual {v3, p1}, Ll/۬ᩳ᩷;->᩸(Ll/ۧᩳ᩷;)V

    if-nez v1, :cond_e

    if-nez v2, :cond_e

    if-eqz v0, :cond_e

    .line 7247
    iget-object v0, p1, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-static {v0}, Ll/ۢۙۙ;->ۙ(Landroid/view/View;)V

    const/4 v0, 0x0

    .line 7248
    iput-object v0, p1, Ll/ۧᩳ᩷;->mBindingAdapter:Ll/۫۟᩷;

    .line 7249
    iput-object v0, p1, Ll/ۧᩳ᩷;->mOwnerRecyclerView:Ll/᩻ᩳ᩷;

    :cond_e
    return-void

    .line 7180
    :cond_f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 7182
    invoke-virtual {v3}, Ll/᩻ᩳ᩷;->exceptionLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7174
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Tmp detached view should be removed from RecyclerView before it can be recycled: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7176
    invoke-virtual {v3}, Ll/᩻ᩳ᩷;->exceptionLabel()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 7167
    :cond_11
    :goto_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Scrapped or attached views may not be recycled. isScrap:"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 7169
    invoke-virtual {p1}, Ll/ۧᩳ᩷;->isScrap()Z

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, " isAttached:"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    .line 7170
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_12

    const/4 v1, 0x1

    :cond_12
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ll/᩻ᩳ᩷;->exceptionLabel()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۙ(Ll/ۧᩳ᩷;Z)V
    .locals 5

    .line 7262
    invoke-static {p1}, Ll/᩻ᩳ᩷;->᩷(Ll/ۧᩳ᩷;)V

    .line 7263
    iget-object v0, p1, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    .line 7264
    iget-object v1, p0, Ll/ۖ۟᩷;->ۚ:Ll/᩻ᩳ᩷;

    iget-object v2, v1, Ll/᩻ᩳ᩷;->mAccessibilityDelegate:Ll/ܽᩳ᩷;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 7265
    invoke-virtual {v2}, Ll/ܽᩳ᩷;->getItemDelegate()Ll/᩸ۡ;

    move-result-object v2

    .line 7267
    instance-of v4, v2, Ll/ܺᩳ᩷;

    if-eqz v4, :cond_0

    .line 7268
    check-cast v2, Ll/ܺᩳ᩷;

    .line 7270
    invoke-virtual {v2, v0}, Ll/ܺᩳ᩷;->᩷(Landroid/view/View;)Ll/᩸ۡ;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    .line 7273
    :goto_0
    invoke-static {v0, v2}, Ll/᩸۠;->ۙ(Landroid/view/View;Ll/᩸ۡ;)V

    :cond_1
    if-eqz p2, :cond_6

    .line 7505
    iget-object p2, v1, Ll/᩻ᩳ᩷;->mRecyclerListener:Ll/۠۟᩷;

    if-eqz p2, :cond_2

    .line 7506
    invoke-interface {p2}, Ll/۠۟᩷;->ۙ()V

    .line 7509
    :cond_2
    iget-object p2, v1, Ll/᩻ᩳ᩷;->mRecyclerListeners:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p2, :cond_3

    .line 7511
    iget-object v2, v1, Ll/᩻ᩳ᩷;->mRecyclerListeners:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠۟᩷;

    invoke-interface {v2}, Ll/۠۟᩷;->ۙ()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 7513
    :cond_3
    iget-object p2, v1, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    if-eqz p2, :cond_4

    .line 7514
    invoke-virtual {p2, p1}, Ll/۫۟᩷;->onViewRecycled(Ll/ۧᩳ᩷;)V

    .line 7516
    :cond_4
    iget-object p2, v1, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    if-eqz p2, :cond_5

    .line 7517
    iget-object p2, v1, Ll/᩻ᩳ᩷;->mViewInfoStore:Ll/۬ᩳ᩷;

    invoke-virtual {p2, p1}, Ll/۬ᩳ᩷;->᩸(Ll/ۧᩳ᩷;)V

    .line 7519
    :cond_5
    sget-boolean p2, Ll/᩻ᩳ᩷;->sVerboseLoggingEnabled:Z

    if-eqz p2, :cond_6

    invoke-static {p1}, Ll/ܽۚۗ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 7278
    :cond_6
    iput-object v3, p1, Ll/ۧᩳ᩷;->mBindingAdapter:Ll/۫۟᩷;

    .line 7279
    iput-object v3, p1, Ll/ۧᩳ᩷;->mOwnerRecyclerView:Ll/᩻ᩳ᩷;

    .line 7280
    invoke-virtual {p0}, Ll/ۖ۟᩷;->ۙ()Ll/ۡ۟᩷;

    move-result-object p2

    invoke-virtual {p2, p1}, Ll/ۡ۟᩷;->ۙ(Ll/ۧᩳ᩷;)V

    return-void
.end method

.method public final ۙ(Ll/۫۟᩷;Ll/۫۟᩷;Z)V
    .locals 5

    .line 6631
    iget-object v0, p0, Ll/ۖ۟᩷;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 6632
    invoke-virtual {p0}, Ll/ۖ۟᩷;->ᩴ()V

    const/4 v0, 0x1

    .line 7525
    invoke-direct {p0, p1, v0}, Ll/ۖ۟᩷;->ۙ(Ll/۫۟᩷;Z)V

    .line 7526
    invoke-virtual {p0}, Ll/ۖ۟᩷;->ۙ()Ll/ۡ۟᩷;

    move-result-object v1

    if-eqz p1, :cond_0

    .line 6464
    iget p1, v1, Ll/ۡ۟᩷;->ۙ:I

    sub-int/2addr p1, v0

    iput p1, v1, Ll/ۡ۟᩷;->ۙ:I

    :cond_0
    if-nez p3, :cond_2

    .line 6518
    iget p1, v1, Ll/ۡ۟᩷;->ۙ:I

    if-nez p1, :cond_2

    .line 6340
    iget-object p1, v1, Ll/ۡ۟᩷;->ۤ:Landroid/util/SparseArray;

    const/4 p3, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge p3, v2, :cond_2

    .line 6341
    invoke-virtual {p1, p3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨۟᩷;

    .line 6342
    iget-object v3, v2, Ll/֨۟᩷;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۧᩳ᩷;

    .line 6343
    iget-object v4, v4, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-static {v4}, Ll/ۢۙۙ;->ۙ(Landroid/view/View;)V

    goto :goto_1

    .line 6345
    :cond_1
    iget-object v2, v2, Ll/֨۟᩷;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    .line 6460
    iget p1, v1, Ll/ۡ۟᩷;->ۙ:I

    add-int/2addr p1, v0

    iput p1, v1, Ll/ۡ۟᩷;->ۙ:I

    goto :goto_2

    .line 7526
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7528
    :goto_2
    invoke-direct {p0}, Ll/ۖ۟᩷;->۫()V

    return-void
.end method

.method public final ۤ()V
    .locals 0

    .line 7638
    invoke-direct {p0}, Ll/ۖ۟᩷;->۫()V

    return-void
.end method

.method public final ۤ(I)V
    .locals 3

    .line 7149
    sget v0, Ll/᩻ᩳ᩷;->HORIZONTAL:I

    .line 7152
    iget-object v0, p0, Ll/ۖ۟᩷;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧᩳ᩷;

    .line 7153
    sget-boolean v2, Ll/᩻ᩳ᩷;->sVerboseLoggingEnabled:Z

    if-eqz v2, :cond_0

    .line 7154
    invoke-static {v1}, Ll/ܽۚۗ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    const/4 v2, 0x1

    .line 7156
    invoke-virtual {p0, v1, v2}, Ll/ۖ۟᩷;->ۙ(Ll/ۧᩳ᩷;Z)V

    .line 7157
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method public final ܳ()V
    .locals 4

    .line 6646
    iget-object v0, p0, Ll/ۖ۟᩷;->ۚ:Ll/᩻ᩳ᩷;

    iget-object v0, v0, Ll/᩻ᩳ᩷;->mLayout:Ll/᩶۟᩷;

    if-eqz v0, :cond_0

    iget v0, v0, Ll/᩶۟᩷;->mPrefetchMaxCountObserved:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 6647
    :goto_0
    iget v1, p0, Ll/ۖ۟᩷;->ᩴ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ۖ۟᩷;->۫:I

    .line 6650
    iget-object v0, p0, Ll/ۖ۟᩷;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_1
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_1

    .line 6651
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    iget v3, p0, Ll/ۖ۟᩷;->۫:I

    if-le v2, v3, :cond_1

    .line 6652
    invoke-virtual {p0, v1}, Ll/ۖ۟᩷;->ۤ(I)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final ᩴ()V
    .locals 3

    .line 7127
    iget-object v0, p0, Ll/ۖ۟᩷;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_0

    .line 7129
    invoke-virtual {p0, v1}, Ll/ۖ۟᩷;->ۤ(I)V

    goto :goto_0

    .line 7131
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7132
    sget-boolean v0, Ll/᩻ᩳ᩷;->ALLOW_THREAD_GAP_WORK:Z

    if-eqz v0, :cond_2

    .line 7133
    iget-object v0, p0, Ll/ۖ۟᩷;->ۚ:Ll/᩻ᩳ᩷;

    iget-object v0, v0, Ll/᩻ᩳ᩷;->mPrefetchRegistry:Ll/ۜܿ᩷;

    .line 153
    iget-object v1, v0, Ll/ۜܿ᩷;->᩷:[I

    if-eqz v1, :cond_1

    const/4 v2, -0x1

    .line 154
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    :cond_1
    const/4 v1, 0x0

    .line 156
    iput v1, v0, Ll/ۜܿ᩷;->ۙ:I

    :cond_2
    return-void
.end method

.method public final ᩷(I)Landroid/view/View;
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    .line 6853
    invoke-virtual {p0, p1, v0, v1}, Ll/ۖ۟᩷;->ۙ(IJ)Ll/ۧᩳ᩷;

    move-result-object p1

    iget-object p1, p1, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    return-object p1
.end method

.method public final ᩷()Ljava/util/List;
    .locals 1

    .line 6663
    iget-object v0, p0, Ll/ۖ۟᩷;->ܳ:Ljava/util/List;

    return-object v0
.end method

.method public final ᩷(Landroid/view/View;)V
    .locals 3

    .line 7306
    invoke-static {p1}, Ll/᩻ᩳ᩷;->᩷(Landroid/view/View;)Ll/ۧᩳ᩷;

    move-result-object p1

    const/16 v0, 0xc

    .line 7307
    invoke-virtual {p1, v0}, Ll/ۧᩳ᩷;->hasAnyOfTheFlags(I)Z

    move-result v0

    iget-object v1, p0, Ll/ۖ۟᩷;->ۚ:Ll/᩻ᩳ᩷;

    if-nez v0, :cond_2

    .line 7308
    invoke-virtual {p1}, Ll/ۧᩳ᩷;->isUpdated()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v1, p1}, Ll/᩻ᩳ᩷;->canReuseUpdatedViewHolder(Ll/ۧᩳ᩷;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 7317
    :cond_0
    iget-object v0, p0, Ll/ۖ۟᩷;->ۤ:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 7318
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۖ۟᩷;->ۤ:Ljava/util/ArrayList;

    :cond_1
    const/4 v0, 0x1

    .line 7320
    invoke-virtual {p1, p0, v0}, Ll/ۧᩳ᩷;->setScrapContainer(Ll/ۖ۟᩷;Z)V

    .line 7321
    iget-object v0, p0, Ll/ۖ۟᩷;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 7309
    :cond_2
    :goto_0
    invoke-virtual {p1}, Ll/ۧᩳ᩷;->isInvalid()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ll/ۧᩳ᩷;->isRemoved()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, v1, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    invoke-virtual {v0}, Ll/۫۟᩷;->hasStableIds()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    .line 7310
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 7312
    invoke-virtual {v1}, Ll/᩻ᩳ᩷;->exceptionLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    const/4 v0, 0x0

    .line 7314
    invoke-virtual {p1, p0, v0}, Ll/ۧᩳ᩷;->setScrapContainer(Ll/ۖ۟᩷;Z)V

    .line 7315
    iget-object v0, p0, Ll/ۖ۟᩷;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ᩷(Ll/ۧᩳ᩷;)V
    .locals 1

    .line 7332
    iget-boolean v0, p1, Ll/ۧᩳ᩷;->mInChangeScrap:Z

    if-eqz v0, :cond_0

    .line 7333
    iget-object v0, p0, Ll/ۖ۟᩷;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 7335
    :cond_0
    iget-object v0, p0, Ll/ۖ۟᩷;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_0
    const/4 v0, 0x0

    .line 7337
    iput-object v0, p1, Ll/ۧᩳ᩷;->mScrapContainer:Ll/ۖ۟᩷;

    const/4 v0, 0x0

    .line 7338
    iput-boolean v0, p1, Ll/ۧᩳ᩷;->mInChangeScrap:Z

    .line 7339
    invoke-virtual {p1}, Ll/ۧᩳ᩷;->clearReturnedFromScrapFlag()V

    return-void
.end method

.method public final ᩸()V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 7642
    :goto_0
    iget-object v2, p0, Ll/ۖ۟᩷;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_0

    .line 7643
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧᩳ᩷;

    iget-object v2, v2, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-static {v2}, Ll/ۢۙۙ;->ۙ(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 7645
    :cond_0
    iget-object v1, p0, Ll/ۖ۟᩷;->ۚ:Ll/᩻ᩳ᩷;

    iget-object v1, v1, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    .line 7628
    invoke-direct {p0, v1, v0}, Ll/ۖ۟᩷;->ۙ(Ll/۫۟᩷;Z)V

    return-void
.end method

.method public final ᩸(I)V
    .locals 0

    .line 6641
    iput p1, p0, Ll/ۖ۟᩷;->ᩴ:I

    .line 6642
    invoke-virtual {p0}, Ll/ۖ۟᩷;->ܳ()V

    return-void
.end method
