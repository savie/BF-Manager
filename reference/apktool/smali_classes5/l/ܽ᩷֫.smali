.class public final Ll/ܽ᩷֫;
.super Ljava/lang/Object;
.source "K5ZN"

# interfaces
.implements Ll/᩶᩷֫;


# instance fields
.field public final synthetic ۙ:Ll/᩹᩷֫;


# direct methods
.method public constructor <init>(Ll/᩹᩷֫;)V
    .locals 0

    .line 608
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ᩷֫;->ۙ:Ll/᩹᩷֫;

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 8

    const/4 v0, 0x0

    .line 736
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 725
    iget-object v2, p0, Ll/ܽ᩷֫;->ۙ:Ll/᩹᩷֫;

    iget-object v3, v2, Ll/᩹᩷֫;->ᩴ:Ll/ۧۙ֫;

    iget-object v4, v2, Ll/᩹᩷֫;->֫:Ll/֡᩷֫;

    iget-boolean v5, v2, Ll/᩹᩷֫;->ܺ:Z

    if-eqz v5, :cond_0

    return-void

    .line 728
    :cond_0
    invoke-static {}, Ll/ۧۙ֫;->᩻()I

    move-result v5

    const/4 v6, 0x1

    if-eq v5, v6, :cond_3

    const/4 v7, 0x3

    if-eq v5, v7, :cond_2

    .line 742
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-ne v0, v6, :cond_1

    .line 743
    invoke-interface {v4}, Ll/֡᩷֫;->᩷()V

    return-void

    .line 745
    :cond_1
    invoke-virtual {v3}, Ll/֨֨ۚ;->ۚ()V

    .line 746
    invoke-static {v2}, Ll/᩹᩷֫;->᩷(Ll/᩹᩷֫;)V

    return-void

    .line 733
    :cond_2
    invoke-interface {v4}, Ll/֡᩷֫;->᩸()V

    .line 734
    iput-boolean v0, v2, Ll/᩹᩷֫;->ܳ:Z

    .line 735
    sget-object v0, Ll/ۗ᩷֫;->ۨ:Ll/ܽ᩻ۙ;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 736
    sget-object v0, Ll/ۗ᩷֫;->ܽ:Ll/ܽ᩻ۙ;

    invoke-virtual {v0, v1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 737
    sget-object v0, Ll/ۗ᩷֫;->ܺ:Ll/ܽ᩻ۙ;

    invoke-virtual {v0, v1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 739
    sget-object v0, Ll/ۗ᩷֫;->ܶ:Ll/ܽ᩻ۙ;

    invoke-virtual {v0}, Ll/ܺ᩻ۙ;->ۙ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    return-void

    .line 730
    :cond_3
    invoke-interface {v4}, Ll/֡᩷֫;->᩷()V

    return-void
.end method

.method public final ۙ(I)V
    .locals 3

    .line 709
    sget-object v0, Ll/ۗ᩷֫;->᩻:Ll/ܽ᩻ۙ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x7f12057b

    invoke-static {v2}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "%"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۙ(J)V
    .locals 0

    .line 641
    invoke-static {p1, p2}, Ll/᩹᩷֫;->ۙ(J)V

    return-void
.end method

.method public final ۙ(Ll/ܰ᩹ۙ;Ljava/lang/Exception;)V
    .locals 1

    .line 682
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    .line 683
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 684
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 686
    :cond_0
    sget-object p2, Ll/ۗ᩷֫;->ۧ:Ll/ܽ᩻ۙ;

    invoke-virtual {p2, p1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 687
    sget-object p2, Ll/ۗ᩷֫;->᩻:Ll/ܽ᩻ۙ;

    invoke-virtual {p2, p1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 688
    sget-object p1, Ll/ۗ᩷֫;->ۨ:Ll/ܽ᩻ۙ;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 689
    iget-object p1, p0, Ll/ܽ᩷֫;->ۙ:Ll/᩹᩷֫;

    const/4 p2, 0x0

    .line 1049
    iput-boolean p2, p1, Ll/᩹᩷֫;->ܳ:Z

    return-void
.end method

.method public final ۙ(Ll/ܰ᩹ۙ;Ll/ᩳ۬ۚ;J)V
    .locals 6

    const/4 v0, 0x0

    .line 631
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 612
    iget-object v2, p0, Ll/ܽ᩷֫;->ۙ:Ll/᩹᩷֫;

    iput-object p1, v2, Ll/᩹᩷֫;->ۧ:Ll/ܰ᩹ۙ;

    .line 613
    invoke-static {}, Ll/᩶᩷ۧ;->ۧ()Landroid/os/Handler;

    move-result-object v3

    invoke-static {}, Ll/᩹᩷֫;->۫()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 614
    invoke-static {p2}, Ll/᩹᩷֫;->ۙ(Ll/ᩳ۬ۚ;)V

    .line 615
    invoke-static {p3, p4}, Ll/᩹᩷֫;->ۙ(J)V

    .line 616
    iget-object p2, v2, Ll/᩹᩷֫;->ۤ:Ll/ܶ᩷֫;

    if-eqz p2, :cond_0

    const/4 v3, 0x0

    .line 788
    iput-object v3, v2, Ll/᩹᩷֫;->ۤ:Ll/ܶ᩷֫;

    :cond_0
    if-eqz p2, :cond_1

    .line 622
    invoke-virtual {p2}, Ll/ܶ᩷֫;->position()I

    move-result p2

    invoke-static {p2}, Ll/᩹᩷֫;->ۤ(I)I

    move-result p2

    goto :goto_1

    .line 833
    :cond_1
    iget p2, v2, Ll/᩹᩷֫;->᩻:I

    if-gtz p2, :cond_2

    goto :goto_0

    :cond_2
    const-wide/16 v3, 0x0

    cmp-long v5, p3, v3

    if-lez v5, :cond_3

    int-to-long v3, p2

    cmp-long v5, v3, p3

    if-ltz v5, :cond_3

    .line 838
    iput v0, v2, Ll/᩹᩷֫;->᩻:I

    .line 906
    iget-boolean p2, v2, Ll/᩹᩷֫;->᩸:Z

    if-eqz p2, :cond_4

    .line 907
    iget-object p2, v2, Ll/᩹᩷֫;->ܽ:Ll/۟ۘܳ;

    invoke-static {p2}, Ll/ᩳ᩷֫;->ۙ(Ll/۟ۘܳ;)V

    goto :goto_0

    :cond_3
    move v0, p2

    :cond_4
    :goto_0
    move p2, v0

    .line 624
    :goto_1
    iget-boolean p3, v2, Ll/᩹᩷֫;->᩷:Z

    if-nez p3, :cond_5

    const/4 p3, -0x1

    .line 625
    iput p3, v2, Ll/᩹᩷֫;->᩻:I

    :cond_5
    if-lez p2, :cond_6

    .line 628
    invoke-static {p2}, Ll/᩹᩷֫;->᩸(I)V

    .line 766
    new-instance p3, Ll/ܶ᩷֫;

    invoke-direct {p3, p1, p2}, Ll/ܶ᩷֫;-><init>(Ll/ܰ᩹ۙ;I)V

    .line 767
    iput-object p3, v2, Ll/᩹᩷֫;->ۤ:Ll/ܶ᩷֫;

    .line 768
    iget-object p4, v2, Ll/᩹᩷֫;->֫:Ll/֡᩷֫;

    new-instance v0, Ll/ۧ᩷֫;

    invoke-direct {v0, v2, p3, p1}, Ll/ۧ᩷֫;-><init>(Ll/᩹᩷֫;Ll/ܶ᩷֫;Ll/ܰ᩹ۙ;)V

    invoke-interface {p4, p2, v0}, Ll/֡᩷֫;->ۙ(ILl/ۧ᩷֫;)V

    return-void

    .line 631
    :cond_6
    sget-object p1, Ll/ۗ᩷֫;->ܺ:Ll/ܽ᩻ۙ;

    invoke-virtual {p1, v1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 632
    sget-object p1, Ll/ۗ᩷֫;->ܽ:Ll/ܽ᩻ۙ;

    invoke-virtual {p1, v1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 1054
    iget-boolean p1, v2, Ll/᩹᩷֫;->ܳ:Z

    if-eqz p1, :cond_7

    .line 634
    invoke-static {v2}, Ll/᩹᩷֫;->ۤ(Ll/᩹᩷֫;)V

    :cond_7
    return-void
.end method

.method public final ᩷(I)V
    .locals 3

    .line 694
    iget-object v0, p0, Ll/ܽ᩷֫;->ۙ:Ll/᩹᩷֫;

    iget-boolean v0, v0, Ll/᩹᩷֫;->ܺ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 697
    :cond_0
    div-int/lit8 v0, p1, 0x32

    .line 698
    sget-object v1, Ll/ۗ᩷֫;->ܺ:Ll/ܽ᩻ۙ;

    invoke-virtual {v1}, Ll/ܺ᩻ۙ;->ۙ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-static {v2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-eq v0, v2, :cond_1

    .line 699
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    :cond_1
    int-to-long v0, p1

    .line 701
    invoke-static {v0, v1}, Ll/ۗ᩷֫;->ۙ(J)I

    move-result p1

    .line 702
    sget-object v0, Ll/ۗ᩷֫;->ܽ:Ll/ܽ᩻ۙ;

    invoke-virtual {v0}, Ll/ܺ᩻ۙ;->ۙ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-static {v1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eq p1, v1, :cond_2

    .line 703
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final ᩷(Ll/ܰ᩹ۙ;Ljava/lang/Exception;)V
    .locals 4

    const/4 v0, 0x0

    .line 662
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 646
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 647
    invoke-static {}, Ll/᩶᩷ۧ;->ۧ()Landroid/os/Handler;

    move-result-object v2

    invoke-static {}, Ll/᩹᩷֫;->۫()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 648
    invoke-static {p2}, Ll/᩷֨ۚ;->ۙ(Ljava/lang/Exception;)Z

    move-result v2

    iget-object v3, p0, Ll/ܽ᩷֫;->ۙ:Ll/᩹᩷֫;

    if-eqz v2, :cond_0

    .line 649
    iget-wide p1, v3, Ll/᩹᩷֫;->ۚ:J

    const/4 v0, 0x1

    .line 650
    invoke-virtual {v3, v0}, Ll/᩹᩷֫;->ۙ(Z)V

    .line 652
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object v0

    .line 651
    sget v1, Ll/ۘ᩷֫;->۟:I

    .line 200
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/ۘ᩷֫;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "bin.mt.media.MusicPlayerService.ACTION_EXIT"

    .line 201
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    const-string v2, "playbackSessionId"

    .line 202
    invoke-virtual {v1, v2, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    move-result-object p1

    .line 200
    invoke-virtual {v0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void

    .line 655
    :cond_0
    sget-object v2, Ll/ۗ᩷֫;->ۛ:Ll/ܽ᩻ۙ;

    iget-object p1, p1, Ll/ܰ᩹ۙ;->᩸:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 656
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    .line 657
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 658
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 660
    :cond_1
    sget-object p2, Ll/ۗ᩷֫;->ۧ:Ll/ܽ᩻ۙ;

    invoke-virtual {p2, p1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 661
    sget-object p2, Ll/ۗ᩷֫;->᩻:Ll/ܽ᩻ۙ;

    invoke-virtual {p2, p1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 662
    sget-object p1, Ll/ۗ᩷֫;->ۗ:Ll/ܽ᩻ۙ;

    invoke-virtual {p1, v1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 663
    sget-object p1, Ll/ۗ᩷֫;->᩺:Ll/ܽ᩻ۙ;

    invoke-virtual {p1, v1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 664
    sget-object p1, Ll/ۗ᩷֫;->ܺ:Ll/ܽ᩻ۙ;

    invoke-virtual {p1, v1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 665
    sget-object p1, Ll/ۗ᩷֫;->ܽ:Ll/ܽ᩻ۙ;

    invoke-virtual {p1, v1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 666
    sget-object p1, Ll/ۗ᩷֫;->ۨ:Ll/ܽ᩻ۙ;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 1049
    iput-boolean v0, v3, Ll/᩹᩷֫;->ܳ:Z

    .line 669
    invoke-static {}, Ll/ܿ۬ۚ;->ۙ()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 670
    sget-object p2, Ll/ۗ᩷֫;->ܶ:Ll/ܽ᩻ۙ;

    invoke-virtual {p2, p1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 671
    sget-object p2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    const/16 v1, 0x100

    invoke-static {v1, v1, p2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 672
    invoke-virtual {p1, v0, v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 673
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 674
    sget-object p1, Ll/ۗ᩷֫;->᩹:Ll/ܽ᩻ۙ;

    invoke-virtual {p1, v2}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 675
    invoke-static {v1, v1, p2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 676
    new-instance p2, Landroid/graphics/Canvas;

    invoke-direct {p2, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    sget-object v0, Ll/᩵ܰܳ;->ۙ᩷:Ll/᩹ܰܳ;

    invoke-virtual {v0}, Ll/᩹ܰܳ;->᩸()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 677
    sget-object p2, Ll/ۗ᩷֫;->֫:Ll/ܽ᩻ۙ;

    invoke-virtual {p2, p1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    return-void
.end method

.method public final ᩷(Z)V
    .locals 2

    if-eqz p1, :cond_0

    .line 714
    iget-object v0, p0, Ll/ܽ᩷֫;->ۙ:Ll/᩹᩷֫;

    iget-boolean v1, v0, Ll/᩹᩷֫;->᩷:Z

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    .line 716
    iput v1, v0, Ll/᩹᩷֫;->᩻:I

    const/4 v1, 0x0

    .line 717
    iput-boolean v1, v0, Ll/᩹᩷֫;->᩷:Z

    .line 906
    iget-boolean v1, v0, Ll/᩹᩷֫;->᩸:Z

    if-eqz v1, :cond_0

    .line 907
    iget-object v0, v0, Ll/᩹᩷֫;->ܽ:Ll/۟ۘܳ;

    invoke-static {v0}, Ll/ᩳ᩷֫;->ۙ(Ll/۟ۘܳ;)V

    .line 720
    :cond_0
    sget-object v0, Ll/ۗ᩷֫;->ۨ:Ll/ܽ᩻ۙ;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    return-void
.end method
