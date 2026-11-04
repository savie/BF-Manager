.class public final Ll/ۖۗ;
.super Ljava/lang/Object;
.source "HIX8"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static ᩻ܳܶ:I


# instance fields
.field public synthetic ֡:[Ljava/lang/Object;

.field public synthetic ܰ:Z

.field public synthetic ܿ:I

.field public synthetic ᩶:[I


# direct methods
.method static native constructor <clinit>()V
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0xa

    .line 61
    invoke-direct {p0, v0}, Ll/ۖۗ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    .line 82
    sget-object p1, Ll/ۜۗ;->ۙ:[I

    iput-object p1, p0, Ll/ۖۗ;->᩶:[I

    .line 83
    sget-object p1, Ll/ۜۗ;->᩷:[Ljava/lang/Object;

    iput-object p1, p0, Ll/ۖۗ;->֡:[Ljava/lang/Object;

    return-void

    :cond_0
    mul-int/lit8 p1, p1, 0x4

    const/4 v0, 0x4

    :goto_0
    const/16 v1, 0x20

    if-ge v0, v1, :cond_2

    const/4 v1, 0x1

    shl-int/2addr v1, v0

    add-int/lit8 v1, v1, -0xc

    if-gt p1, v1, :cond_1

    move p1, v1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 31
    :cond_2
    :goto_1
    div-int/lit8 p1, p1, 0x4

    .line 86
    new-array v0, p1, [I

    iput-object v0, p0, Ll/ۖۗ;->᩶:[I

    .line 87
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Ll/ۖۗ;->֡:[Ljava/lang/Object;

    return-void
.end method

.method public static ۖ۫ܰ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/۟֡֫;

    invoke-interface {p0}, Ll/۟֡֫;->۫()Z

    move-result p0

    return p0
.end method

.method public static ۖ᩸۫(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, [B

    invoke-static {p0}, Ll/ܳ֫ܺ;->᩷([B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۖ᩹ۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Landroid/os/BaseBundle;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۜۜۧ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ᩳ֫ܺ;

    invoke-interface {p0}, Ll/ᩳ֫ܺ;->apply()V

    return-void
.end method

.method public static ۜۡۡ(Ljava/lang/Object;Z)V
    .locals 0

    check-cast p0, Ll/ۖۖۧ;

    invoke-virtual {p0, p1}, Ll/ۖۖۧ;->ۙ(Z)V

    return-void
.end method

.method public static ۜ᩻ᩳ(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ۖۖۧ;

    check-cast p2, Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {p0, p1, p2}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    return-void
.end method

.method public static ۢ᩸ۙ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/۠ۖۧ;

    invoke-virtual {p0}, Ll/۠ۖۧ;->dismiss()V

    return-void
.end method

.method public static ۫֡ܺ()I
    .locals 1

    const v0, 0x4ba96b80    # 2.2206208E7f

    return v0
.end method

.method public static ܰᩴۖ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Landroid/view/ViewGroup;

    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public static ܰ᩵ۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ܽ֡֫;

    check-cast p1, Ll/ܶ᩹;

    invoke-virtual {p0, p1}, Ll/ܽ֡֫;->ۙ(Ll/ܶ᩹;)V

    return-void
.end method

.method public static ܰ᩸ۧ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/᩺ۜ᩸;

    invoke-virtual {p0}, Ll/᩺ۜ᩸;->֨᩷()Z

    move-result p0

    return p0
.end method

.method public static ܳܰ᩺([SIII)Ljava/lang/String;
    .locals 3

    new-array v1, p2, [C

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ᩵ܰܶ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Landroid/view/View;

    check-cast p1, Landroid/view/View$OnClickListener;

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static ᩷ۘܽ(Ljava/lang/Object;I)V
    .locals 0

    check-cast p0, Lcom/google/android/material/textfield/TextInputLayout;

    invoke-static {p0, p1}, Ll/ܽ۬᩻;->ۙ(Lcom/google/android/material/textfield/TextInputLayout;I)V

    return-void
.end method

.method public static ᩹֡ܳ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ܳܿ᩸;

    invoke-virtual {p0}, Ll/ܳܿ᩸;->close()V

    return-void
.end method

.method public static ᩺ۘ᩵(Ljava/lang/Object;I)I
    .locals 0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 60
    invoke-virtual {p0}, Ll/ۖۗ;->clone()Ll/ۖۗ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/ۖۗ;
    .locals 2

    .line 93
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>"

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ll/ۖۗ;

    .line 94
    iget-object v1, p0, Ll/ۖۗ;->᩶:[I

    invoke-virtual {v1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iput-object v1, v0, Ll/ۖۗ;->᩶:[I

    .line 95
    iget-object v1, p0, Ll/ۖۗ;->֡:[Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, v0, Ll/ۖۗ;->֡:[Ljava/lang/Object;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 513
    invoke-virtual {p0}, Ll/ۖۗ;->ۙ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "{}"

    return-object v0

    .line 516
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۖۗ;->ܿ:I

    mul-int/lit8 v1, v1, 0x1c

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v1, 0x7b

    .line 517
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 518
    iget v1, p0, Ll/ۖۗ;->ܿ:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    if-lez v2, :cond_1

    const-string v3, ", "

    .line 520
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    :cond_1
    iget-boolean v3, p0, Ll/ۖۗ;->ܰ:Z

    if-eqz v3, :cond_2

    .line 424
    invoke-static {p0}, Ll/۠ۗ;->ۙ(Ll/ۖۗ;)V

    .line 426
    :cond_2
    iget-object v3, p0, Ll/ۖۗ;->᩶:[I

    aget v3, v3, v2

    .line 523
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v3, 0x3d

    .line 524
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 525
    invoke-virtual {p0, v2}, Ll/ۖۗ;->ۙ(I)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, p0, :cond_3

    .line 527
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    const-string v3, "(this Map)"

    .line 529
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    const/16 v1, 0x7d

    .line 532
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 533
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "buffer.toString()"

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۙ()I
    .locals 1

    .line 412
    iget-boolean v0, p0, Ll/ۖۗ;->ܰ:Z

    if-eqz v0, :cond_0

    .line 413
    invoke-static {p0}, Ll/۠ۗ;->ۙ(Ll/ۖۗ;)V

    .line 415
    :cond_0
    iget v0, p0, Ll/ۖۗ;->ܿ:I

    return v0
.end method

.method public final ۙ(I)Ljava/lang/Object;
    .locals 1

    .line 431
    iget-boolean v0, p0, Ll/ۖۗ;->ܰ:Z

    if-eqz v0, :cond_0

    .line 432
    invoke-static {p0}, Ll/۠ۗ;->ۙ(Ll/ۖۗ;)V

    .line 438
    :cond_0
    iget-object v0, p0, Ll/ۖۗ;->֡:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ۙ(ILjava/lang/Object;)V
    .locals 5

    .line 493
    iget v0, p0, Ll/ۖۗ;->ܿ:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/ۖۗ;->᩶:[I

    add-int/lit8 v2, v0, -0x1

    aget v1, v1, v2

    if-gt p1, v1, :cond_0

    .line 494
    invoke-virtual {p0, p1, p2}, Ll/ۖۗ;->ۤ(ILjava/lang/Object;)V

    return-void

    .line 497
    :cond_0
    iget-boolean v1, p0, Ll/ۖۗ;->ܰ:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ۖۗ;->᩶:[I

    array-length v1, v1

    if-lt v0, v1, :cond_1

    .line 498
    invoke-static {p0}, Ll/۠ۗ;->ۙ(Ll/ۖۗ;)V

    .line 500
    :cond_1
    iget v0, p0, Ll/ۖۗ;->ܿ:I

    .line 501
    iget-object v1, p0, Ll/ۖۗ;->᩶:[I

    array-length v1, v1

    const/4 v2, 0x1

    if-lt v0, v1, :cond_4

    add-int/lit8 v1, v0, 0x1

    mul-int/lit8 v1, v1, 0x4

    const/4 v3, 0x4

    :goto_0
    const/16 v4, 0x20

    if-ge v3, v4, :cond_3

    shl-int v4, v2, v3

    add-int/lit8 v4, v4, -0xc

    if-gt v1, v4, :cond_2

    move v1, v4

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 31
    :cond_3
    :goto_1
    div-int/lit8 v1, v1, 0x4

    .line 503
    iget-object v3, p0, Ll/ۖۗ;->᩶:[I

    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    const-string v4, "copyOf(this, newSize)"

    invoke-static {v3, v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, p0, Ll/ۖۗ;->᩶:[I

    .line 504
    iget-object v3, p0, Ll/ۖۗ;->֡:[Ljava/lang/Object;

    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Ll/ۖۗ;->֡:[Ljava/lang/Object;

    .line 506
    :cond_4
    iget-object v1, p0, Ll/ۖۗ;->᩶:[I

    aput p1, v1, v0

    .line 507
    iget-object p1, p0, Ll/ۖۗ;->֡:[Ljava/lang/Object;

    aput-object p2, p1, v0

    add-int/2addr v0, v2

    .line 508
    iput v0, p0, Ll/ۖۗ;->ܿ:I

    return-void
.end method

.method public final ۤ(ILjava/lang/Object;)V
    .locals 5

    .line 353
    iget-object v0, p0, Ll/ۖۗ;->᩶:[I

    iget v1, p0, Ll/ۖۗ;->ܿ:I

    invoke-static {v1, p1, v0}, Ll/ۜۗ;->ۙ(II[I)I

    move-result v0

    if-ltz v0, :cond_0

    .line 355
    iget-object p1, p0, Ll/ۖۗ;->֡:[Ljava/lang/Object;

    aput-object p2, p1, v0

    return-void

    :cond_0
    not-int v0, v0

    .line 358
    iget v1, p0, Ll/ۖۗ;->ܿ:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Ll/ۖۗ;->֡:[Ljava/lang/Object;

    aget-object v1, v1, v0

    invoke-static {}, Ll/۠ۗ;->ۙ()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_1

    .line 359
    iget-object v1, p0, Ll/ۖۗ;->᩶:[I

    aput p1, v1, v0

    .line 360
    iget-object p1, p0, Ll/ۖۗ;->֡:[Ljava/lang/Object;

    aput-object p2, p1, v0

    return-void

    .line 363
    :cond_1
    iget-boolean v1, p0, Ll/ۖۗ;->ܰ:Z

    if-eqz v1, :cond_2

    iget v1, p0, Ll/ۖۗ;->ܿ:I

    iget-object v2, p0, Ll/ۖۗ;->᩶:[I

    array-length v2, v2

    if-lt v1, v2, :cond_2

    .line 364
    invoke-static {p0}, Ll/۠ۗ;->ۙ(Ll/ۖۗ;)V

    .line 367
    iget-object v0, p0, Ll/ۖۗ;->᩶:[I

    iget v1, p0, Ll/ۖۗ;->ܿ:I

    invoke-static {v1, p1, v0}, Ll/ۜۗ;->ۙ(II[I)I

    move-result v0

    not-int v0, v0

    .line 369
    :cond_2
    iget v1, p0, Ll/ۖۗ;->ܿ:I

    iget-object v2, p0, Ll/ۖۗ;->᩶:[I

    array-length v2, v2

    const/4 v3, 0x1

    if-lt v1, v2, :cond_5

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x4

    const/4 v2, 0x4

    :goto_0
    const/16 v4, 0x20

    if-ge v2, v4, :cond_4

    shl-int v4, v3, v2

    add-int/lit8 v4, v4, -0xc

    if-gt v1, v4, :cond_3

    move v1, v4

    goto :goto_1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 31
    :cond_4
    :goto_1
    div-int/lit8 v1, v1, 0x4

    .line 371
    iget-object v2, p0, Ll/ۖۗ;->᩶:[I

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    const-string v4, "copyOf(this, newSize)"

    invoke-static {v2, v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Ll/ۖۗ;->᩶:[I

    .line 372
    iget-object v2, p0, Ll/ۖۗ;->֡:[Ljava/lang/Object;

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Ll/ۖۗ;->֡:[Ljava/lang/Object;

    .line 374
    :cond_5
    iget v1, p0, Ll/ۖۗ;->ܿ:I

    sub-int v2, v1, v0

    if-eqz v2, :cond_6

    .line 375
    iget-object v2, p0, Ll/ۖۗ;->᩶:[I

    add-int/lit8 v4, v0, 0x1

    invoke-static {v4, v0, v2, v2, v1}, Ll/᩶۟᩵;->ۙ(II[I[II)V

    .line 381
    iget-object v1, p0, Ll/ۖۗ;->֡:[Ljava/lang/Object;

    .line 385
    iget v2, p0, Ll/ۖۗ;->ܿ:I

    .line 381
    invoke-static {v4, v0, v2, v1, v1}, Ll/᩶۟᩵;->ۙ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 388
    :cond_6
    iget-object v1, p0, Ll/ۖۗ;->᩶:[I

    aput p1, v1, v0

    .line 389
    iget-object p1, p0, Ll/ۖۗ;->֡:[Ljava/lang/Object;

    aput-object p2, p1, v0

    .line 390
    iget p1, p0, Ll/ۖۗ;->ܿ:I

    add-int/2addr p1, v3

    iput p1, p0, Ll/ۖۗ;->ܿ:I

    return-void
.end method
