.class public final Ll/ۛܺ᩵;
.super Ljava/lang/Object;
.source "RIV5"


# instance fields
.field public final ۙ:Ll/ۨܺ᩵;

.field public final ۤ:Ll/ۨܺ᩵;

.field public ܳ:I

.field public ᩴ:I

.field public ᩷:I

.field public ᩸:I


# direct methods
.method public constructor <init>(Ll/ۨܺ᩵;Ll/ۨܺ᩵;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Ll/ۛܺ᩵;->ۤ:Ll/ۨܺ᩵;

    .line 28
    iput-object p2, p0, Ll/ۛܺ᩵;->ۙ:Ll/ۨܺ᩵;

    return-void
.end method

.method public static ۙ(Ll/ۨܺ᩵;Ll/ۨܺ᩵;Z)Ll/ۚ᩶ۗ;
    .locals 6

    if-eqz p2, :cond_3

    .line 142
    invoke-virtual {p0}, Ll/ۨܺ᩵;->ܽ()I

    move-result p2

    if-eqz p2, :cond_2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    .line 163
    sget-object p2, Ll/ۤ᩶ۗ;->֡:Ll/ۤ᩶ۗ;

    goto :goto_0

    .line 165
    :cond_0
    new-instance p0, Ll/۬ۧ᩵;

    const-string p1, "Unknown annotation visibility value: "

    .line 0
    invoke-static {p2, p1}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 165
    throw p0

    .line 161
    :cond_1
    sget-object p2, Ll/ۤ᩶ۗ;->ܿ:Ll/ۤ᩶ۗ;

    goto :goto_0

    .line 159
    :cond_2
    sget-object p2, Ll/ۤ᩶ۗ;->᩶:Ll/ۤ᩶ۗ;

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    .line 145
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    invoke-static {p0}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v0

    invoke-static {p0}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v1

    .line 147
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_4

    .line 306
    invoke-static {p0}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v4

    .line 149
    invoke-virtual {p1, v4}, Ll/ۨܺ᩵;->ܳ(I)Ljava/lang/String;

    move-result-object v4

    .line 150
    invoke-static {p0, p1}, Ll/᩺ܺ᩵;->᩷(Ll/ۨܺ᩵;Ll/ۨܺ᩵;)Ll/ܳ᩶ۗ;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 152
    :cond_4
    invoke-virtual {p1, v0}, Ll/ۨܺ᩵;->۫(I)Ljava/lang/String;

    move-result-object p0

    .line 153
    new-instance p1, Ll/ۚ᩶ۗ;

    invoke-direct {p1, p2, p0, v2}, Ll/ۚ᩶ۗ;-><init>(Ll/ۤ᩶ۗ;Ljava/lang/String;Ljava/util/LinkedHashMap;)V

    return-object p1
.end method


# virtual methods
.method public final ۙ(Ll/ۨܺ᩵;)Ljava/util/ArrayList;
    .locals 1

    .line 174
    iget-object v0, p0, Ll/ۛܺ᩵;->ۙ:Ll/ۨܺ᩵;

    invoke-static {p1, v0}, Ll/᩺ܺ᩵;->ۙ(Ll/ۨܺ᩵;Ll/ۨܺ᩵;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(I)Ljava/util/List;
    .locals 6

    if-nez p1, :cond_0

    .line 102
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    .line 104
    :cond_0
    iget-object v0, p0, Ll/ۛܺ᩵;->ۤ:Ll/ۨܺ᩵;

    invoke-virtual {v0, p1}, Ll/ۨܺ᩵;->ۙ(I)V

    .line 105
    invoke-virtual {v0}, Ll/ۨܺ᩵;->ۚ()I

    move-result p1

    if-nez p1, :cond_1

    .line 107
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    .line 109
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 110
    invoke-virtual {v0}, Ll/ۨܺ᩵;->᩷()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p1, :cond_2

    mul-int/lit8 v4, v3, 0x4

    add-int/2addr v4, v2

    .line 112
    invoke-virtual {v0, v4}, Ll/ۨܺ᩵;->ۙ(I)V

    .line 113
    invoke-virtual {v0}, Ll/ۨܺ᩵;->ۚ()I

    move-result v4

    .line 114
    invoke-virtual {v0, v4}, Ll/ۨܺ᩵;->ۙ(I)V

    .line 115
    iget-object v4, p0, Ll/ۛܺ᩵;->ۙ:Ll/ۨܺ᩵;

    const/4 v5, 0x1

    invoke-static {v0, v4, v5}, Ll/ۛܺ᩵;->ۙ(Ll/ۨܺ᩵;Ll/ۨܺ᩵;Z)Ll/ۚ᩶ۗ;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public final ۙ()Ll/ۛܺ᩵;
    .locals 3

    .line 32
    new-instance v0, Ll/ۛܺ᩵;

    iget-object v1, p0, Ll/ۛܺ᩵;->ۤ:Ll/ۨܺ᩵;

    invoke-virtual {v1}, Ll/ۨܺ᩵;->ۙ()Ll/ۨܺ᩵;

    move-result-object v1

    iget-object v2, p0, Ll/ۛܺ᩵;->ۙ:Ll/ۨܺ᩵;

    invoke-virtual {v2}, Ll/ۨܺ᩵;->ۙ()Ll/ۨܺ᩵;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll/ۛܺ᩵;-><init>(Ll/ۨܺ᩵;Ll/ۨܺ᩵;)V

    return-object v0
.end method

.method public final ۤ()Ljava/util/Map;
    .locals 5

    .line 59
    iget v0, p0, Ll/ۛܺ᩵;->᩷:I

    if-nez v0, :cond_0

    .line 60
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object v0

    :cond_0
    const/16 v0, 0x10

    .line 62
    iget-object v1, p0, Ll/ۛܺ᩵;->ۤ:Ll/ۨܺ᩵;

    invoke-virtual {v1, v0}, Ll/ۨܺ᩵;->ۚ(I)V

    .line 63
    new-instance v0, Ljava/util/HashMap;

    iget v2, p0, Ll/ۛܺ᩵;->᩷:I

    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(I)V

    const/4 v2, 0x0

    .line 64
    :goto_0
    iget v3, p0, Ll/ۛܺ᩵;->᩷:I

    if-ge v2, v3, :cond_1

    .line 65
    invoke-virtual {v1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v3

    .line 66
    invoke-virtual {v1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v4

    .line 67
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final ۤ(I)V
    .locals 1

    .line 36
    iput p1, p0, Ll/ۛܺ᩵;->ᩴ:I

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 38
    iput p1, p0, Ll/ۛܺ᩵;->᩷:I

    .line 39
    iput p1, p0, Ll/ۛܺ᩵;->᩸:I

    .line 40
    iput p1, p0, Ll/ۛܺ᩵;->ܳ:I

    return-void

    .line 42
    :cond_0
    iget-object v0, p0, Ll/ۛܺ᩵;->ۤ:Ll/ۨܺ᩵;

    invoke-virtual {v0, p1}, Ll/ۨܺ᩵;->ۧ(I)V

    const/4 p1, 0x4

    .line 43
    invoke-virtual {v0, p1}, Ll/ۨܺ᩵;->ۚ(I)V

    .line 44
    invoke-virtual {v0}, Ll/ۨܺ᩵;->ۚ()I

    move-result p1

    iput p1, p0, Ll/ۛܺ᩵;->᩷:I

    .line 45
    invoke-virtual {v0}, Ll/ۨܺ᩵;->ۚ()I

    move-result p1

    iput p1, p0, Ll/ۛܺ᩵;->᩸:I

    .line 46
    invoke-virtual {v0}, Ll/ۨܺ᩵;->ۚ()I

    move-result p1

    iput p1, p0, Ll/ۛܺ᩵;->ܳ:I

    return-void
.end method

.method public final ᩴ()Ljava/util/Map;
    .locals 5

    .line 73
    iget v0, p0, Ll/ۛܺ᩵;->᩸:I

    if-nez v0, :cond_0

    .line 74
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object v0

    .line 76
    :cond_0
    iget v0, p0, Ll/ۛܺ᩵;->᩷:I

    mul-int/lit8 v0, v0, 0x8

    add-int/lit8 v0, v0, 0x10

    iget-object v1, p0, Ll/ۛܺ᩵;->ۤ:Ll/ۨܺ᩵;

    invoke-virtual {v1, v0}, Ll/ۨܺ᩵;->ۚ(I)V

    .line 77
    new-instance v0, Ljava/util/HashMap;

    iget v2, p0, Ll/ۛܺ᩵;->᩸:I

    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(I)V

    const/4 v2, 0x0

    .line 78
    :goto_0
    iget v3, p0, Ll/ۛܺ᩵;->᩸:I

    if-ge v2, v3, :cond_1

    .line 79
    invoke-virtual {v1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v3

    .line 80
    invoke-virtual {v1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v4

    .line 81
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final ᩷()Ljava/util/List;
    .locals 2

    .line 51
    iget v0, p0, Ll/ۛܺ᩵;->ᩴ:I

    if-nez v0, :cond_0

    .line 52
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 54
    :cond_0
    iget-object v1, p0, Ll/ۛܺ᩵;->ۤ:Ll/ۨܺ᩵;

    invoke-virtual {v1, v0}, Ll/ۨܺ᩵;->ۙ(I)V

    invoke-virtual {v1}, Ll/ۨܺ᩵;->ۚ()I

    move-result v0

    .line 55
    invoke-virtual {p0, v0}, Ll/ۛܺ᩵;->ۙ(I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷(I)Ljava/util/List;
    .locals 5

    if-nez p1, :cond_0

    .line 122
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    .line 124
    :cond_0
    iget-object v0, p0, Ll/ۛܺ᩵;->ۤ:Ll/ۨܺ᩵;

    invoke-virtual {v0, p1}, Ll/ۨܺ᩵;->ۙ(I)V

    .line 125
    invoke-virtual {v0}, Ll/ۨܺ᩵;->ۚ()I

    move-result p1

    if-nez p1, :cond_1

    .line 127
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    .line 129
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_2

    .line 131
    invoke-virtual {v0}, Ll/ۨܺ᩵;->ۚ()I

    move-result v3

    .line 132
    invoke-virtual {v0}, Ll/ۨܺ᩵;->᩷()I

    move-result v4

    .line 133
    invoke-virtual {p0, v3}, Ll/ۛܺ᩵;->ۙ(I)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    invoke-virtual {v0, v4}, Ll/ۨܺ᩵;->ۙ(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public final ᩸()Ljava/util/Map;
    .locals 5

    .line 87
    iget v0, p0, Ll/ۛܺ᩵;->ܳ:I

    if-nez v0, :cond_0

    .line 88
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object v0

    .line 90
    :cond_0
    iget v0, p0, Ll/ۛܺ᩵;->᩷:I

    mul-int/lit8 v0, v0, 0x8

    add-int/lit8 v0, v0, 0x10

    iget v1, p0, Ll/ۛܺ᩵;->᩸:I

    mul-int/lit8 v1, v1, 0x8

    add-int/2addr v1, v0

    iget-object v0, p0, Ll/ۛܺ᩵;->ۤ:Ll/ۨܺ᩵;

    invoke-virtual {v0, v1}, Ll/ۨܺ᩵;->ۚ(I)V

    .line 91
    new-instance v1, Ljava/util/HashMap;

    iget v2, p0, Ll/ۛܺ᩵;->ܳ:I

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    const/4 v2, 0x0

    .line 92
    :goto_0
    iget v3, p0, Ll/ۛܺ᩵;->ܳ:I

    if-ge v2, v3, :cond_1

    .line 93
    invoke-virtual {v0}, Ll/ۨܺ᩵;->ۚ()I

    move-result v3

    .line 94
    invoke-virtual {v0}, Ll/ۨܺ᩵;->ۚ()I

    move-result v4

    .line 95
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method
