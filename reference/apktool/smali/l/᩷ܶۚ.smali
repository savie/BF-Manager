.class public final Ll/᩷ܶۚ;
.super Ljava/lang/Object;
.source "G7AI"


# instance fields
.field public final ֫:Ljava/util/Set;

.field public final ۙ:Ll/֨ܽۚ;

.field public final ۚ:I

.field public ۤ:Ll/ۗܶۚ;

.field public final ۫:Ljava/lang/String;

.field public final ܳ:Ljava/lang/String;

.field public ᩴ:Ll/ۗܶۚ;

.field public ᩷:Ll/ۗܶۚ;

.field public ᩸:Ll/۫ܶۚ;


# direct methods
.method public constructor <init>(Ll/֨ܽۚ;ILjava/lang/String;Ljava/lang/String;Ljava/util/Set;)V
    .locals 0

    .line 1778
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1779
    iput-object p1, p0, Ll/᩷ܶۚ;->ۙ:Ll/֨ܽۚ;

    .line 1780
    iput p2, p0, Ll/᩷ܶۚ;->ۚ:I

    .line 1781
    iput-object p3, p0, Ll/᩷ܶۚ;->۫:Ljava/lang/String;

    .line 1782
    iput-object p4, p0, Ll/᩷ܶۚ;->ܳ:Ljava/lang/String;

    .line 1783
    iput-object p5, p0, Ll/᩷ܶۚ;->֫:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final ۙ()Ll/ܽܶۚ;
    .locals 11

    .line 1813
    iget-object v0, p0, Ll/᩷ܶۚ;->᩸:Ll/۫ܶۚ;

    iget-object v2, p0, Ll/᩷ܶۚ;->۫:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 1814
    new-instance v0, Ll/ܽܶۚ;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Ll/ܽܶۚ;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0

    .line 1817
    :cond_0
    iget-object v1, p0, Ll/᩷ܶۚ;->ᩴ:Ll/ۗܶۚ;

    if-eqz v1, :cond_1

    goto :goto_0

    .line 1818
    :cond_1
    iget-object v1, p0, Ll/᩷ܶۚ;->᩷:Ll/ۗܶۚ;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Ll/᩷ܶۚ;->ۤ:Ll/ۗܶۚ;

    :goto_0
    if-nez v1, :cond_3

    .line 1820
    new-instance v10, Ll/ܽܶۚ;

    iget-object v4, v0, Ll/۫ܶۚ;->ܳ:Ljava/lang/String;

    iget-object v5, v0, Ll/۫ܶۚ;->᩷:Ljava/lang/String;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const-string v7, "null_value"

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Ll/ܽܶۚ;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v10

    .line 1819
    :cond_3
    iget-object v7, v1, Ll/ۗܶۚ;->᩹:Ljava/lang/String;

    const-string v0, "item_list"

    .line 1833
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "null_value"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "unparsed"

    .line 1834
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, v1, Ll/ۗܶۚ;->ܶ:Ljava/lang/String;

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    const/4 v3, 0x0

    .line 219
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v5, 0x12c

    invoke-static {v3, v4, v5, v0}, Ll/֨۫ۚ;->ۙ(IIILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v0, 0x0

    :goto_2
    move-object v8, v0

    .line 1824
    new-instance v0, Ll/ܽܶۚ;

    iget-object v3, p0, Ll/᩷ܶۚ;->᩸:Ll/۫ܶۚ;

    iget-object v4, v3, Ll/۫ܶۚ;->ܳ:Ljava/lang/String;

    iget-object v5, v3, Ll/۫ܶۚ;->᩷:Ljava/lang/String;

    iget-object v6, v1, Ll/ۗܶۚ;->ۛ:Ljava/lang/String;

    iget-boolean v9, v1, Ll/ۗܶۚ;->ܽ:Z

    const/4 v3, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Ll/ܽܶۚ;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method
