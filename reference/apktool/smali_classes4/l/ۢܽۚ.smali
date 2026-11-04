.class public final synthetic Ll/ۢܽۚ;
.super Ljava/lang/Object;
.source "G7AI"

# interfaces
.implements Ll/ۚܶۚ;


# instance fields
.field public final synthetic ۙ:Ll/᩶ܶۚ;

.field public final synthetic ۤ:Ljava/util/HashSet;

.field public final synthetic ᩷:Ll/֨ܽۚ;

.field public final synthetic ᩸:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/᩶ܶۚ;Ll/֨ܽۚ;Ljava/util/HashSet;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢܽۚ;->ۙ:Ll/᩶ܶۚ;

    iput-object p2, p0, Ll/ۢܽۚ;->᩷:Ll/֨ܽۚ;

    iput-object p3, p0, Ll/ۢܽۚ;->ۤ:Ljava/util/HashSet;

    iput-object p4, p0, Ll/ۢܽۚ;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۖܳۤ;Ll/۠ܳۤ;)Z
    .locals 15

    move-object v0, p0

    const-string v1, "*"

    .line 649
    iget-object v2, v0, Ll/ۢܽۚ;->᩸:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    invoke-static/range {p1 .. p1}, Ll/ۢܶۚ;->ۙ(Ll/ۖܳۤ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 1963
    :goto_1
    iget-object v2, v0, Ll/ۢܽۚ;->ۙ:Ll/᩶ܶۚ;

    iget-object v4, v2, Ll/᩶ܶۚ;->ۤ:Ljava/util/LinkedHashSet;

    invoke-static/range {p1 .. p1}, Ll/ۢܶۚ;->ۙ(Ll/ۖܳۤ;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 1964
    invoke-static/range {p2 .. p2}, Ll/۟ܶۚ;->ۤ(Ll/۠ܳۤ;)Ljava/lang/String;

    move-result-object v4

    .line 1965
    iget-object v5, v2, Ll/᩶ܶۚ;->᩷:Ljava/util/LinkedHashSet;

    invoke-virtual {v5, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    const/4 v12, 0x0

    const/4 v14, 0x0

    .line 1967
    iget-object v6, v0, Ll/ۢܽۚ;->᩷:Ll/֨ܽۚ;

    const/16 v9, 0x12c

    const/4 v10, -0x1

    const/4 v11, 0x0

    iget-object v13, v0, Ll/ۢܽۚ;->ۤ:Ljava/util/HashSet;

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    invoke-static/range {v6 .. v14}, Ll/۟ܶۚ;->ۙ(Ll/֨ܽۚ;Ll/ۖܳۤ;Ll/۠ܳۤ;IIIILjava/util/Set;Ljava/util/HashMap;)Ll/ۗܶۚ;

    move-result-object v1

    const-string v4, "item_list"

    .line 1969
    iget-object v5, v1, Ll/ۗܶۚ;->᩹:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 1970
    iget-object v2, v2, Ll/᩶ܶۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_2
    return v3
.end method
