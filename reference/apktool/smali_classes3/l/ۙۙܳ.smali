.class public final Ll/ۙۙܳ;
.super Ll/ۖۙܺ;
.source "HIRF"


# instance fields
.field public ֫:Ll/۫ۙܳ;

.field public ۚ:Ll/ܶۤܳ;

.field public ۧ:Ll/ܶۤܳ;

.field public ۫:Ll/᩹ۙܳ;

.field public volatile ܳ:Z

.field public final synthetic ܶ:Ll/᩸ۙܳ;

.field public ܺ:Ll/᩹ۙܳ;

.field public ܽ:Ll/ܶۤܳ;

.field public ᩻:Ll/۬ۙܳ;


# direct methods
.method public constructor <init>(Ll/᩸ۙܳ;)V
    .locals 0

    .line 685
    iput-object p1, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-direct {p0}, Ll/ۖۙܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 17

    move-object/from16 v0, p0

    .line 722
    iget-boolean v1, v0, Ll/ۙۙܳ;->ܳ:Z

    if-nez v1, :cond_6

    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->۟(Ll/᩸ۙܳ;)Ll/ۙۙܳ;

    move-result-object v1

    if-ne v1, v0, :cond_6

    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, v0, Ll/ۙۙܳ;->᩻:Ll/۬ۙܳ;

    if-nez v1, :cond_0

    goto/16 :goto_3

    .line 723
    :cond_0
    iget-object v2, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v2, v1}, Ll/᩸ۙܳ;->ۙ(Ll/᩸ۙܳ;Ll/۬ۙܳ;)V

    .line 724
    iget-object v1, v0, Ll/ۙۙܳ;->֫:Ll/۫ۙܳ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 725
    iget-object v3, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    iget-object v1, v1, Ll/۫ۙܳ;->᩶:Ll/ۚۙܳ;

    iget-object v1, v1, Ll/ۚۙܳ;->᩸:Ll/֨᩷ܳ;

    invoke-static {v3, v1}, Ll/᩸ۙܳ;->ۙ(Ll/᩸ۙܳ;Ll/֨᩷ܳ;)V

    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    iget-object v3, v0, Ll/ۙۙܳ;->֫:Ll/۫ۙܳ;

    iget-object v3, v3, Ll/۫ۙܳ;->ܿ:Ll/ۚۙܳ;

    iget-object v3, v3, Ll/ۚۙܳ;->᩸:Ll/֨᩷ܳ;

    invoke-static {v1, v3}, Ll/᩸ۙܳ;->᩷(Ll/᩸ۙܳ;Ll/֨᩷ܳ;)V

    .line 726
    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    iget-object v3, v0, Ll/ۙۙܳ;->֫:Ll/۫ۙܳ;

    iget-object v3, v3, Ll/۫ۙܳ;->᩶:Ll/ۚۙܳ;

    iget-boolean v3, v3, Ll/ۚۙܳ;->᩷:Z

    invoke-static {v1, v3}, Ll/᩸ۙܳ;->ۙ(Ll/᩸ۙܳ;Z)V

    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    iget-object v3, v0, Ll/ۙۙܳ;->֫:Ll/۫ۙܳ;

    iget-object v3, v3, Ll/۫ۙܳ;->ܿ:Ll/ۚۙܳ;

    iget-boolean v3, v3, Ll/ۚۙܳ;->᩷:Z

    invoke-static {v1, v3}, Ll/᩸ۙܳ;->᩷(Ll/᩸ۙܳ;Z)V

    .line 727
    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    iget-object v3, v0, Ll/ۙۙܳ;->֫:Ll/۫ۙܳ;

    iget-object v3, v3, Ll/۫ۙܳ;->᩶:Ll/ۚۙܳ;

    iget-object v3, v3, Ll/ۚۙܳ;->ۙ:Ll/ܶۤܳ;

    invoke-static {v1, v3}, Ll/᩸ۙܳ;->᩷(Ll/᩸ۙܳ;Ll/ܶۤܳ;)V

    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    iget-object v3, v0, Ll/ۙۙܳ;->֫:Ll/۫ۙܳ;

    iget-object v3, v3, Ll/۫ۙܳ;->ܿ:Ll/ۚۙܳ;

    iget-object v3, v3, Ll/ۚۙܳ;->ۙ:Ll/ܶۤܳ;

    invoke-static {v1, v3}, Ll/᩸ۙܳ;->ۤ(Ll/᩸ۙܳ;Ll/ܶۤܳ;)V

    .line 728
    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->֫(Ll/᩸ۙܳ;)Ll/ܿۙܳ;

    move-result-object v1

    iget-object v3, v0, Ll/ۙۙܳ;->֫:Ll/۫ۙܳ;

    iget-object v4, v3, Ll/۫ۙܳ;->᩶:Ll/ۚۙܳ;

    iget-object v4, v4, Ll/ۚۙܳ;->ۤ:Ll/ᩳܳܳ;

    iget-object v3, v3, Ll/۫ۙܳ;->ܿ:Ll/ۚۙܳ;

    iget-object v3, v3, Ll/ۚۙܳ;->ۤ:Ll/ᩳܳܳ;

    iget-object v5, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v5}, Ll/᩸ۙܳ;->ۧ(Ll/᩸ۙܳ;)Ll/۬ۙܳ;

    move-result-object v5

    invoke-virtual {v1, v4, v3, v5}, Ll/ܿۙܳ;->ۙ(Ll/ᩳܳܳ;Ll/ᩳܳܳ;Ll/۬ۙܳ;)V

    .line 729
    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    iget-object v3, v0, Ll/ۙۙܳ;->ۧ:Ll/ܶۤܳ;

    invoke-static {v1, v3}, Ll/᩸ۙܳ;->ۙ(Ll/᩸ۙܳ;Ll/ܶۤܳ;)V

    iput-object v2, v0, Ll/ۙۙܳ;->ۧ:Ll/ܶۤܳ;

    iput-object v2, v0, Ll/ۙۙܳ;->֫:Ll/۫ۙܳ;

    goto/16 :goto_0

    .line 731
    :cond_1
    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    iget-object v3, v0, Ll/ۙۙܳ;->۫:Ll/᩹ۙܳ;

    invoke-static {v1, v3}, Ll/᩸ۙܳ;->ۙ(Ll/᩸ۙܳ;Ll/᩹ۙܳ;)V

    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    iget-object v3, v0, Ll/ۙۙܳ;->ܺ:Ll/᩹ۙܳ;

    invoke-static {v1, v3}, Ll/᩸ۙܳ;->᩷(Ll/᩸ۙܳ;Ll/᩹ۙܳ;)V

    iput-object v2, v0, Ll/ۙۙܳ;->ܺ:Ll/᩹ۙܳ;

    iput-object v2, v0, Ll/ۙۙܳ;->۫:Ll/᩹ۙܳ;

    .line 732
    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->ܶ(Ll/᩸ۙܳ;)Ll/᩹ۙܳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩹ۙܳ;->᩷()Ll/֨᩷ܳ;

    move-result-object v3

    invoke-static {v1, v3}, Ll/᩸ۙܳ;->ۙ(Ll/᩸ۙܳ;Ll/֨᩷ܳ;)V

    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->᩺(Ll/᩸ۙܳ;)Ll/᩹ۙܳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩹ۙܳ;->᩷()Ll/֨᩷ܳ;

    move-result-object v3

    invoke-static {v1, v3}, Ll/᩸ۙܳ;->᩷(Ll/᩸ۙܳ;Ll/֨᩷ܳ;)V

    .line 733
    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->ܶ(Ll/᩸ۙܳ;)Ll/᩹ۙܳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩹ۙܳ;->ۙ()Z

    move-result v3

    invoke-static {v1, v3}, Ll/᩸ۙܳ;->ۙ(Ll/᩸ۙܳ;Z)V

    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->᩺(Ll/᩸ۙܳ;)Ll/᩹ۙܳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩹ۙܳ;->ۙ()Z

    move-result v3

    invoke-static {v1, v3}, Ll/᩸ۙܳ;->᩷(Ll/᩸ۙܳ;Z)V

    .line 734
    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    iget-object v3, v0, Ll/ۙۙܳ;->ۚ:Ll/ܶۤܳ;

    invoke-static {v1, v3}, Ll/᩸ۙܳ;->᩷(Ll/᩸ۙܳ;Ll/ܶۤܳ;)V

    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    iget-object v3, v0, Ll/ۙۙܳ;->ܽ:Ll/ܶۤܳ;

    invoke-static {v1, v3}, Ll/᩸ۙܳ;->ۤ(Ll/᩸ۙܳ;Ll/ܶۤܳ;)V

    iput-object v2, v0, Ll/ۙۙܳ;->ܽ:Ll/ܶۤܳ;

    iput-object v2, v0, Ll/ۙۙܳ;->ۚ:Ll/ܶۤܳ;

    .line 735
    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->֫(Ll/᩸ۙܳ;)Ll/ܿۙܳ;

    move-result-object v1

    iget-object v3, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v3}, Ll/᩸ۙܳ;->ܶ(Ll/᩸ۙܳ;)Ll/᩹ۙܳ;

    move-result-object v3

    iget-object v4, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v4}, Ll/᩸ۙܳ;->᩺(Ll/᩸ۙܳ;)Ll/᩹ۙܳ;

    move-result-object v4

    iget-object v5, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v5}, Ll/᩸ۙܳ;->ۧ(Ll/᩸ۙܳ;)Ll/۬ۙܳ;

    move-result-object v5

    invoke-virtual {v1, v3, v4, v5}, Ll/ܿۙܳ;->ۙ(Ll/᩹ۙܳ;Ll/᩹ۙܳ;Ll/۬ۙܳ;)V

    .line 736
    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->ܶ(Ll/᩸ۙܳ;)Ll/᩹ۙܳ;

    move-result-object v1

    invoke-static {v1}, Ll/᩸ۙܳ;->ۙ(Ll/᩹ۙܳ;)V

    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->᩺(Ll/᩸ۙܳ;)Ll/᩹ۙܳ;

    move-result-object v1

    invoke-static {v1}, Ll/᩸ۙܳ;->ۙ(Ll/᩹ۙܳ;)V

    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1, v2}, Ll/᩸ۙܳ;->᩷(Ll/᩸ۙܳ;Ll/᩹ۙܳ;)V

    invoke-static {v1, v2}, Ll/᩸ۙܳ;->ۙ(Ll/᩸ۙܳ;Ll/᩹ۙܳ;)V

    .line 738
    :goto_0
    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->֫(Ll/᩸ۙܳ;)Ll/ܿۙܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܿۙܳ;->᩸()V

    .line 739
    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->ܺ(Ll/᩸ۙܳ;)Ll/۟᩷ۙ;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/۟᩷ۙ;->۫(I)V

    .line 740
    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->᩵(Ll/᩸ۙܳ;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 741
    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->֫(Ll/᩸ۙܳ;)Ll/ܿۙܳ;

    move-result-object v2

    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->᩵(Ll/᩸ۙܳ;)Landroid/os/Bundle;

    move-result-object v1

    const-string v3, "leftFocused"

    const/4 v14, 0x1

    invoke-virtual {v1, v3, v14}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->᩵(Ll/᩸ۙܳ;)Landroid/os/Bundle;

    move-result-object v1

    const-string v4, "selected1"

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iget-object v5, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v5}, Ll/᩸ۙܳ;->᩵(Ll/᩸ۙܳ;)Landroid/os/Bundle;

    move-result-object v5

    iget-object v6, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v6}, Ll/᩸ۙܳ;->᩵(Ll/᩸ۙܳ;)Landroid/os/Bundle;

    move-result-object v6

    .line 742
    invoke-virtual {v6, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v4

    const-string v6, "end1"

    invoke-virtual {v5, v6, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v5

    iget-object v4, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v4}, Ll/᩸ۙܳ;->᩵(Ll/᩸ۙܳ;)Landroid/os/Bundle;

    move-result-object v4

    const-string v6, "multi1"

    invoke-virtual {v4, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    iget-object v4, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v4}, Ll/᩸ۙܳ;->᩵(Ll/᩸ۙܳ;)Landroid/os/Bundle;

    move-result-object v4

    const-string v7, "nibble1"

    invoke-virtual {v4, v7, v14}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    iget-object v4, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v4}, Ll/᩸ۙܳ;->᩵(Ll/᩸ۙܳ;)Landroid/os/Bundle;

    move-result-object v4

    const-string v8, "selected2"

    .line 743
    invoke-virtual {v4, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v9

    iget-object v4, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v4}, Ll/᩸ۙܳ;->᩵(Ll/᩸ۙܳ;)Landroid/os/Bundle;

    move-result-object v4

    iget-object v10, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v10}, Ll/᩸ۙܳ;->᩵(Ll/᩸ۙܳ;)Landroid/os/Bundle;

    move-result-object v10

    invoke-virtual {v10, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v8

    const-string v10, "end2"

    invoke-virtual {v4, v10, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v10

    iget-object v4, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v4}, Ll/᩸ۙܳ;->᩵(Ll/᩸ۙܳ;)Landroid/os/Bundle;

    move-result-object v4

    const-string v8, "multi2"

    .line 744
    invoke-virtual {v4, v8}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v11

    iget-object v4, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v4}, Ll/᩸ۙܳ;->᩵(Ll/᩸ۙܳ;)Landroid/os/Bundle;

    move-result-object v4

    const-string v8, "nibble2"

    invoke-virtual {v4, v8, v14}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v12

    iget-object v4, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v4}, Ll/᩸ۙܳ;->᩵(Ll/᩸ۙܳ;)Landroid/os/Bundle;

    move-result-object v4

    const-string v8, "top"

    invoke-virtual {v4, v8}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v15

    move v4, v1

    move v8, v9

    move v9, v10

    move v10, v11

    move v11, v12

    move-wide v12, v15

    .line 741
    invoke-virtual/range {v2 .. v13}, Ll/ܿۙܳ;->ۙ(ZIIZZIIZZJ)V

    .line 745
    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->֫(Ll/᩸ۙܳ;)Ll/ܿۙܳ;

    move-result-object v1

    iget-object v2, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v2}, Ll/᩸ۙܳ;->᩵(Ll/᩸ۙܳ;)Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "cursorSlot"

    const-wide/16 v4, -0x1

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    iget-object v4, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v4}, Ll/᩸ۙܳ;->᩵(Ll/᩸ۙܳ;)Landroid/os/Bundle;

    move-result-object v4

    const-string v5, "cursorNibble"

    invoke-virtual {v4, v5, v14}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v1, v2, v3, v4}, Ll/ܿۙܳ;->ۙ(JZ)V

    .line 746
    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->ۢ(Ll/᩸ۙܳ;)V

    goto :goto_1

    .line 747
    :cond_2
    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->ۧ(Ll/᩸ۙܳ;)Ll/۬ۙܳ;

    move-result-object v1

    iget-object v1, v1, Ll/۬ۙܳ;->᩷:Ll/ۢۙܳ;

    iget v1, v1, Ll/ۢۙܳ;->ܰ:I

    if-lez v1, :cond_3

    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->֫(Ll/᩸ۙܳ;)Ll/ܿۙܳ;

    move-result-object v1

    invoke-virtual {v1, v2}, Ll/ܿۙܳ;->ۙ(I)V

    .line 750
    :cond_3
    :goto_1
    invoke-static {}, Ll/ᩳۡ᩻;->ܶ()Z

    move-result v1

    if-nez v1, :cond_4

    const v1, 0x7f120455

    invoke-static {v1}, Ll/᩸۠ۧ;->᩷(I)V

    goto :goto_2

    .line 751
    :cond_4
    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->ۧ(Ll/᩸ۙܳ;)Ll/۬ۙܳ;

    move-result-object v1

    iget-boolean v1, v1, Ll/۬ۙܳ;->ۙ:Z

    if-eqz v1, :cond_5

    const v1, 0x7f120454

    invoke-static {v1}, Ll/᩸۠ۧ;->᩷(I)V

    .line 752
    :cond_5
    :goto_2
    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-virtual {v1}, Ll/᩸ۙܳ;->᩷ۙ()V

    .line 753
    iget-object v1, v0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->᩷ۙ(Ll/᩸ۙܳ;)V

    :cond_6
    :goto_3
    return-void
.end method

.method public final ۙ(Ljava/lang/Exception;)V
    .locals 3

    .line 757
    iget-boolean v0, p0, Ll/ۙۙܳ;->ܳ:Z

    if-nez v0, :cond_4

    instance-of v0, p1, Ll/ۡܳܳ;

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_4

    .line 758
    instance-of v0, p1, Ll/ۨᩴܳ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object p1, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    new-array v0, v2, [Ljava/lang/Object;

    const-string v2, "2 GB"

    aput-object v2, v0, v1

    const v2, 0x7f1201ce

    invoke-virtual {p1, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v2}, Ll/᩸ۙܳ;->ۧ(Ll/᩸ۙܳ;)Ll/۬ۙܳ;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    invoke-virtual {p1, v0, v1}, Ll/ܽ֡֫;->ۙ(Ljava/lang/String;Z)V

    return-void

    .line 759
    :cond_1
    instance-of v0, p1, Ll/۫ۚܳ;

    if-eqz v0, :cond_2

    iget-object p1, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    const v0, 0x7f120453

    invoke-virtual {p1, v0, v2}, Ll/ܽ֡֫;->ۙ(IZ)V

    return-void

    .line 760
    :cond_2
    iget-object v0, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v0}, Ll/᩸ۙܳ;->ۧ(Ll/᩸ۙܳ;)Ll/۬ۙܳ;

    move-result-object v2

    if-nez v2, :cond_3

    const/4 v1, 0x1

    :cond_3
    invoke-virtual {v0, p1, v1}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Z)V

    :cond_4
    return-void
.end method

.method public final ᩴ()V
    .locals 6

    .line 698
    iget-boolean v0, p0, Ll/ۙۙܳ;->ܳ:Z

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 699
    :cond_0
    iget-object v0, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v0}, Ll/᩸ۙܳ;->᩹(Ll/᩸ۙܳ;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ll/ۢ۬ᩴ;

    invoke-direct {v1, p0}, Ll/ۢ۬ᩴ;-><init>(Ll/ۙۙܳ;)V

    invoke-static {v0, v1}, Ll/֨ۜᩴ;->ۙ(Ljava/lang/String;Ljava/util/function/BooleanSupplier;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v0}, Ll/᩸ۙܳ;->ۗ(Ll/᩸ۙܳ;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ll/֨۬ᩴ;

    invoke-direct {v1, p0}, Ll/֨۬ᩴ;-><init>(Ll/ۙۙܳ;)V

    .line 700
    invoke-static {v0, v1}, Ll/֨ۜᩴ;->ۙ(Ljava/lang/String;Ljava/util/function/BooleanSupplier;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_1

    .line 701
    :cond_1
    iget-object v0, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v0}, Ll/᩸ۙܳ;->᩵(Ll/᩸ۙܳ;)Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    move-object v0, v1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v0}, Ll/᩸ۙܳ;->᩵(Ll/᩸ۙܳ;)Landroid/os/Bundle;

    move-result-object v0

    const-string v2, "checkpoint"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    const/4 v2, 0x0

    if-eqz v0, :cond_3

    .line 703
    new-instance v1, Ll/ۡ۬ᩴ;

    invoke-direct {v1, p0}, Ll/ۡ۬ᩴ;-><init>(Ll/ۙۙܳ;)V

    invoke-static {v0, v1}, Ll/ܶۤܳ;->᩷(Ljava/lang/String;Ll/۟֡֫;)Ll/ܶۤܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۙۙܳ;->ۧ:Ll/ܶۤܳ;

    .line 704
    iget-object v1, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->᩹(Ll/᩸ۙܳ;)Ljava/lang/String;

    move-result-object v1

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v1, v3}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v1

    iget-object v3, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v3}, Ll/᩸ۙܳ;->ۗ(Ll/᩸ۙܳ;)Ljava/lang/String;

    move-result-object v3

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {v3, v2}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v2

    new-instance v3, Ll/ۖ۬ᩴ;

    invoke-direct {v3, p0}, Ll/ۖ۬ᩴ;-><init>(Ll/ۙۙܳ;)V

    invoke-static {v0, v1, v2, v3}, Ll/֫ۙܳ;->ۙ(Ll/ܶۤܳ;Ll/᩷ۨᩴ;Ll/᩷ۨᩴ;Ll/ۖ۬ᩴ;)Ll/۫ۙܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۙۙܳ;->֫:Ll/۫ۙܳ;

    .line 705
    iget-object v0, v0, Ll/۫ۙܳ;->ܰ:Ll/۬ۙܳ;

    iput-object v0, p0, Ll/ۙۙܳ;->᩻:Ll/۬ۙܳ;

    return-void

    .line 707
    :cond_3
    invoke-static {}, Ll/ܶۤܳ;->ܽ()Ll/ܶۤܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۙۙܳ;->ۚ:Ll/ܶۤܳ;

    .line 708
    iget-object v0, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v0}, Ll/᩸ۙܳ;->᩹(Ll/᩸ۙܳ;)Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v0, v3}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    iget-object v3, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-virtual {v3}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v3

    new-instance v4, Ll/۠۬ᩴ;

    invoke-direct {v4, p0}, Ll/۠۬ᩴ;-><init>(Ll/ۙۙܳ;)V

    iget-object v5, p0, Ll/ۙۙܳ;->ۚ:Ll/ܶۤܳ;

    invoke-static {v0, v3, v4, v5}, Ll/᩹ۙܳ;->ۙ(Ll/᩷ۨᩴ;Ljava/io/File;Ljava/util/function/BooleanSupplier;Ll/ܶۤܳ;)Ll/᩹ۙܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۙۙܳ;->۫:Ll/᩹ۙܳ;

    .line 709
    invoke-virtual {v0}, Ll/᩹ۙܳ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Ll/ۙۙܳ;->ۚ:Ll/ܶۤܳ;

    invoke-static {v0}, Ll/᩸ۙܳ;->ۙ(Ll/ܶۤܳ;)V

    iput-object v1, p0, Ll/ۙۙܳ;->ۚ:Ll/ܶۤܳ;

    .line 710
    :cond_4
    iget-boolean v0, p0, Ll/ۙۙܳ;->ܳ:Z

    if-eqz v0, :cond_5

    goto :goto_1

    .line 711
    :cond_5
    invoke-static {}, Ll/ܶۤܳ;->ܽ()Ll/ܶۤܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۙۙܳ;->ܽ:Ll/ܶۤܳ;

    .line 712
    iget-object v0, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v0}, Ll/᩸ۙܳ;->ۗ(Ll/᩸ۙܳ;)Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {v0, v2}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    iget-object v2, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v2

    new-instance v3, Ll/ۜ۬ᩴ;

    invoke-direct {v3, p0}, Ll/ۜ۬ᩴ;-><init>(Ll/ۙۙܳ;)V

    iget-object v4, p0, Ll/ۙۙܳ;->ܽ:Ll/ܶۤܳ;

    invoke-static {v0, v2, v3, v4}, Ll/᩹ۙܳ;->ۙ(Ll/᩷ۨᩴ;Ljava/io/File;Ljava/util/function/BooleanSupplier;Ll/ܶۤܳ;)Ll/᩹ۙܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۙۙܳ;->ܺ:Ll/᩹ۙܳ;

    .line 713
    invoke-virtual {v0}, Ll/᩹ۙܳ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Ll/ۙۙܳ;->ܽ:Ll/ܶۤܳ;

    invoke-static {v0}, Ll/᩸ۙܳ;->ۙ(Ll/ܶۤܳ;)V

    iput-object v1, p0, Ll/ۙۙܳ;->ܽ:Ll/ܶۤܳ;

    .line 714
    :cond_6
    iget-object v0, p0, Ll/ۙۙܳ;->۫:Ll/᩹ۙܳ;

    invoke-virtual {v0}, Ll/᩹ۙܳ;->ۤ()V

    iget-object v0, p0, Ll/ۙۙܳ;->ܺ:Ll/᩹ۙܳ;

    invoke-virtual {v0}, Ll/᩹ۙܳ;->ۤ()V

    .line 715
    iget-object v0, p0, Ll/ۙۙܳ;->۫:Ll/᩹ۙܳ;

    iget-object v1, p0, Ll/ۙۙܳ;->ܺ:Ll/᩹ۙܳ;

    new-instance v2, Ll/۬۬ᩴ;

    invoke-direct {v2, p0}, Ll/۬۬ᩴ;-><init>(Ll/ۙۙܳ;)V

    invoke-static {v0, v1, v2}, Ll/۬ۙܳ;->ۙ(Ll/᩸۫ܳ;Ll/᩸۫ܳ;Ljava/util/function/BooleanSupplier;)Ll/۬ۙܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۙۙܳ;->᩻:Ll/۬ۙܳ;

    .line 716
    iget-boolean v0, p0, Ll/ۙۙܳ;->ܳ:Z

    if-eqz v0, :cond_7

    goto :goto_1

    .line 718
    :cond_7
    iget-object v0, p0, Ll/ۙۙܳ;->۫:Ll/᩹ۙܳ;

    invoke-virtual {v0}, Ll/᩹ۙܳ;->ۤ()V

    iget-object v0, p0, Ll/ۙۙܳ;->ܺ:Ll/᩹ۙܳ;

    invoke-virtual {v0}, Ll/᩹ۙܳ;->ۤ()V

    :cond_8
    :goto_1
    return-void
.end method

.method public final ᩷()V
    .locals 2

    .line 693
    iget-object v0, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    const v1, 0x7f120966

    invoke-virtual {p0, v0, v1}, Ll/ۖۙܺ;->ۙ(Ll/ܽ֡֫;I)V

    .line 694
    iget-object v0, p0, Ll/ۖۙܺ;->᩷:Ll/۬֨ᩴ;

    new-instance v1, Ll/ᩳ۬ᩴ;

    invoke-direct {v1, p0}, Ll/ᩳ۬ᩴ;-><init>(Ll/ۙۙܳ;)V

    invoke-virtual {v0, v1}, Ll/۬֨ᩴ;->ۙ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ᩸()V
    .locals 2

    .line 765
    iget-object v0, p0, Ll/ۙۙܳ;->۫:Ll/᩹ۙܳ;

    invoke-static {v0}, Ll/᩸ۙܳ;->ۙ(Ll/᩹ۙܳ;)V

    iget-object v0, p0, Ll/ۙۙܳ;->ܺ:Ll/᩹ۙܳ;

    invoke-static {v0}, Ll/᩸ۙܳ;->ۙ(Ll/᩹ۙܳ;)V

    const/4 v0, 0x0

    iput-object v0, p0, Ll/ۙۙܳ;->ܺ:Ll/᩹ۙܳ;

    iput-object v0, p0, Ll/ۙۙܳ;->۫:Ll/᩹ۙܳ;

    .line 766
    iget-object v1, p0, Ll/ۙۙܳ;->ۚ:Ll/ܶۤܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->ۙ(Ll/ܶۤܳ;)V

    iget-object v1, p0, Ll/ۙۙܳ;->ܽ:Ll/ܶۤܳ;

    invoke-static {v1}, Ll/᩸ۙܳ;->ۙ(Ll/ܶۤܳ;)V

    iput-object v0, p0, Ll/ۙۙܳ;->ܽ:Ll/ܶۤܳ;

    iput-object v0, p0, Ll/ۙۙܳ;->ۚ:Ll/ܶۤܳ;

    .line 767
    iget-object v1, p0, Ll/ۙۙܳ;->֫:Ll/۫ۙܳ;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/۫ۙܳ;->close()V

    iput-object v0, p0, Ll/ۙۙܳ;->֫:Ll/۫ۙܳ;

    .line 768
    :cond_0
    invoke-virtual {p0}, Ll/ۖۙܺ;->ۤ()V

    .line 769
    iget-object v0, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v0}, Ll/᩸ۙܳ;->۟(Ll/᩸ۙܳ;)Ll/ۙۙܳ;

    move-result-object v0

    if-ne v0, p0, :cond_1

    iget-object v0, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v0}, Ll/᩸ۙܳ;->ۖ(Ll/᩸ۙܳ;)V

    .line 770
    :cond_1
    iget-object v0, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-virtual {v0}, Ll/ۘᩴ;->invalidateOptionsMenu()V

    .line 771
    :cond_2
    iget-boolean v0, p0, Ll/ۙۙܳ;->ܳ:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-static {v0}, Ll/᩸ۙܳ;->ۧ(Ll/᩸ۙܳ;)Ll/۬ۙܳ;

    move-result-object v0

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/ۙۙܳ;->ܶ:Ll/᩸ۙܳ;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_3
    return-void
.end method
