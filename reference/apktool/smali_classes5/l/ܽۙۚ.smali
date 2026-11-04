.class public final synthetic Ll/ܽۙۚ;
.super Ljava/lang/Object;
.source "498X"

# interfaces
.implements Ll/ܽۧܺ;
.implements Lnet/sf/sevenzipjbinding/ISequentialOutStream;
.implements Ll/᩻᩵ܳ;
.implements Ll/ۨۙۚ;
.implements Ll/᩵۬;
.implements Ll/᩸ۖ;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܽۙۚ;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Ll/ۘۜ;)Ll/ۘۜ;
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ܽۙۚ;->ܰ:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/search/SearchView;

    invoke-static {v0, p1, p2}, Lcom/google/android/material/search/SearchView;->$r8$lambda$lg1Kf9luTqvuNNQuLqehlYyGOi8(Lcom/google/android/material/search/SearchView;Landroid/view/View;Ll/ۘۜ;)Ll/ۘۜ;

    move-result-object p1

    return-object p1
.end method

.method public perform(Landroid/view/View;Ll/֫۬;)Z
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ܽۙۚ;->ܰ:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;

    invoke-static {v0, p1, p2}, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->$r8$lambda$kcYefU7mDsxaDDUrYFwGm-Fzkow(Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;Landroid/view/View;Ll/֫۬;)Z

    move-result p1

    return p1
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ܽۙۚ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۖܳ᩸;

    .line 260
    invoke-interface {v0}, Ll/۟֡֫;->۫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 263
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    return p1

    .line 261
    :cond_0
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۙ(I)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ܽۙۚ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/۫ۡۤ;

    invoke-virtual {v0, p1}, Ll/ᩳۜۧ;->ۧ(I)V

    return-void
.end method

.method public ۙ(JJ)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ܽۙۚ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/۫۬ܳ;

    invoke-static {v0, p1, p2, p3, p4}, Ll/۫۬ܳ;->᩷(Ll/۫۬ܳ;JJ)V

    return-void
.end method

.method public ᩷(I)B
    .locals 5

    .line 2
    iget-object v0, p0, Ll/ܽۙۚ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/util/ArrayList;

    if-ltz p1, :cond_2

    .line 51
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 52
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚۙۚ;

    .line 53
    invoke-virtual {v3}, Ll/ۚۙۚ;->᩸()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ge p1, v4, :cond_0

    add-int/lit8 p1, p1, 0x1

    .line 55
    invoke-virtual {v3, p1}, Ll/ۚۙۚ;->ۤ(I)B

    move-result p1

    return p1

    :cond_0
    sub-int/2addr p1, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 59
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method
