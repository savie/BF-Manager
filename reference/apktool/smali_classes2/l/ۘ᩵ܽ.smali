.class public final Ll/ۘ᩵ܽ;
.super Ljava/lang/Object;
.source "DIVX"


# static fields
.field public static final ۗ:Ll/ۗ᩵ܽ;

.field public static final ۘ:Ljava/util/List;

.field public static final ۛ:Ll/ۧۨܽ;

.field public static final ۨ:Ll/֫᩺ܽ;

.field public static final ܶ:Ll/ۘ᩵ܽ;

.field public static final ᩵:Ll/ۨ᩵ܽ;

.field public static final ᩹:Ll/᩺ۨܽ;

.field public static final ᩺:Ll/ۧۨܽ;


# instance fields
.field public ֫:Ll/᩷ۨܽ;

.field public ۙ:I

.field public final ۚ:Ljava/util/HashMap;

.field public ۤ:Ll/ܰۨܽ;

.field public ۧ:Ll/᩻ۨܽ;

.field public final ۫:Ljava/util/ArrayList;

.field public ܳ:Ll/ۨ᩵ܽ;

.field public final ܺ:Ljava/util/ArrayDeque;

.field public ܽ:I

.field public ᩴ:Ll/᩵᩵ܽ;

.field public ᩷:Z

.field public final ᩸:Ljava/util/ArrayList;

.field public ᩻:Ll/᩻ۨܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    .line 97
    sget-object v0, Ll/ۨ᩵ܽ;->᩸:Ll/ۨ᩵ܽ;

    sput-object v0, Ll/ۘ᩵ܽ;->᩵:Ll/ۨ᩵ܽ;

    .line 104
    sget-object v0, Ll/ۗ᩵ܽ;->᩶:Ll/ۗ᩵ܽ;

    sput-object v0, Ll/ۘ᩵ܽ;->ۗ:Ll/ۗ᩵ܽ;

    .line 106
    sget-object v0, Ll/ۧۨܽ;->ܿ:Ll/ۧۨܽ;

    sput-object v0, Ll/ۘ᩵ܽ;->᩺:Ll/ۧۨܽ;

    .line 107
    sget-object v0, Ll/ۧۨܽ;->֡:Ll/ۧۨܽ;

    sput-object v0, Ll/ۘ᩵ܽ;->ۛ:Ll/ۧۨܽ;

    .line 110
    new-instance v2, Ll/᩺ۨܽ;

    .line 112
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {v2, v1, v0}, Ll/᩺ۨܽ;-><init>(Ljava/util/List;Ljava/util/Map;)V

    sput-object v2, Ll/ۘ᩵ܽ;->᩹:Ll/᩺ۨܽ;

    .line 115
    new-instance v5, Ll/֫᩺ܽ;

    invoke-direct {v5, v2}, Ll/֫᩺ܽ;-><init>(Ll/᩺ۨܽ;)V

    sput-object v5, Ll/ۘ᩵ܽ;->ۨ:Ll/֫᩺ܽ;

    .line 123
    new-instance v0, Ll/ۘ᩵ܽ;

    invoke-direct {v0}, Ll/ۘ᩵ܽ;-><init>()V

    sput-object v0, Ll/ۘ᩵ܽ;->ܶ:Ll/ۘ᩵ܽ;

    .line 929
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 932
    sget-object v1, Ll/᩸ܰܽ;->ۛ:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 933
    iget-object v1, v0, Ll/ۘ᩵ܽ;->᩻:Ll/᩻ۨܽ;

    invoke-static {v1}, Ll/ۘ᩺ܽ;->ۙ(Ll/᩻ۨܽ;)Ll/ܶۨܽ;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 936
    iget-object v1, v0, Ll/ۘ᩵ܽ;->ۤ:Ll/ܰۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1029
    iget-object v1, v0, Ll/ۘ᩵ܽ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 1030
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1031
    invoke-static {v3}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 1032
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1035
    :cond_0
    iget-object v1, v0, Ll/ۘ᩵ܽ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 1036
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1038
    invoke-static {v3}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 1039
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1045
    :cond_1
    iget v1, v0, Ll/ۘ᩵ܽ;->ۙ:I

    iget v3, v0, Ll/ۘ᩵ܽ;->ܽ:I

    sget-boolean v4, Ll/ۨܰܽ;->᩸:Z

    const/4 v6, 0x2

    if-ne v1, v6, :cond_2

    if-eq v3, v6, :cond_4

    .line 1059
    :cond_2
    sget-object v6, Ll/᩶ۛܽ;->᩷:Ll/᩶ۛܽ;

    invoke-virtual {v6, v1, v3}, Ll/᩶ۛܽ;->ۙ(II)Ll/ܶۨܽ;

    move-result-object v6

    if-eqz v4, :cond_3

    .line 1062
    sget-object v8, Ll/ۨܰܽ;->ᩴ:Ll/᩶ۛܽ;

    .line 1063
    invoke-virtual {v8, v1, v3}, Ll/᩶ۛܽ;->ۙ(II)Ll/ܶۨܽ;

    move-result-object v8

    .line 1064
    sget-object v9, Ll/ۨܰܽ;->ۙ:Ll/᩶ۛܽ;

    .line 1065
    invoke-virtual {v9, v1, v3}, Ll/᩶ۛܽ;->ۙ(II)Ll/ܶۨܽ;

    move-result-object v1

    goto :goto_0

    :cond_3
    const/4 v8, 0x0

    move-object v1, v8

    .line 1071
    :goto_0
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v4, :cond_4

    .line 1073
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1074
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 945
    :cond_4
    sget-object v1, Ll/᩸ܰܽ;->ᩳ:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 946
    sget-object v1, Ll/᩸ܰܽ;->ۨ:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 947
    sget-object v1, Ll/᩸ܰܽ;->ۚ:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 948
    sget-object v1, Ll/᩸ܰܽ;->֫:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 949
    sget-object v1, Ll/᩸ܰܽ;->ܿ:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 950
    iget-object v1, v0, Ll/ۘ᩵ܽ;->֫:Ll/᩷ۨܽ;

    invoke-virtual {v1}, Ll/᩷ۨܽ;->ۙ()Ll/ܽۨܽ;

    move-result-object v1

    .line 951
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v4, Ljava/lang/Long;

    invoke-static {v3, v4, v1}, Ll/᩸ܰܽ;->ۙ(Ljava/lang/Class;Ljava/lang/Class;Ll/ܽۨܽ;)Ll/ܶۨܽ;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 952
    const-class v3, Ljava/lang/Double;

    .line 1021
    sget-object v4, Ll/᩸ܰܽ;->ܶ:Ll/ܽۨܽ;

    .line 952
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v3, v4}, Ll/᩸ܰܽ;->ۙ(Ljava/lang/Class;Ljava/lang/Class;Ll/ܽۨܽ;)Ll/ܶۨܽ;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 953
    const-class v3, Ljava/lang/Float;

    .line 1025
    sget-object v4, Ll/᩸ܰܽ;->ۗ:Ll/ܽۨܽ;

    .line 953
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v3, v4}, Ll/᩸ܰܽ;->ۙ(Ljava/lang/Class;Ljava/lang/Class;Ll/ܽۨܽ;)Ll/ܶۨܽ;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 954
    iget-object v3, v0, Ll/ۘ᩵ܽ;->ۧ:Ll/᩻ۨܽ;

    invoke-static {v3}, Ll/ۨ᩺ܽ;->ۙ(Ll/᩻ۨܽ;)Ll/ܶۨܽ;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 955
    sget-object v3, Ll/᩸ܰܽ;->ۤ:Ll/ܶۨܽ;

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 956
    sget-object v3, Ll/᩸ܰܽ;->ۙ:Ll/ܶۨܽ;

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 957
    const-class v3, Ljava/util/concurrent/atomic/AtomicLong;

    .line 958
    invoke-static {v1}, Ll/᩸ܰܽ;->ۙ(Ll/ܽۨܽ;)Ll/ܽۨܽ;

    move-result-object v4

    invoke-static {v3, v4}, Ll/᩸ܰܽ;->ۙ(Ljava/lang/Class;Ll/ܽۨܽ;)Ll/ܶۨܽ;

    move-result-object v3

    .line 957
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 959
    const-class v3, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 961
    invoke-static {v1}, Ll/᩸ܰܽ;->᩷(Ll/ܽۨܽ;)Ll/ܽۨܽ;

    move-result-object v1

    .line 960
    invoke-static {v3, v1}, Ll/᩸ܰܽ;->ۙ(Ljava/lang/Class;Ll/ܽۨܽ;)Ll/ܶۨܽ;

    move-result-object v1

    .line 959
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 962
    sget-object v1, Ll/᩸ܰܽ;->᩷:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 963
    sget-object v1, Ll/᩸ܰܽ;->᩻:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 964
    sget-object v1, Ll/᩸ܰܽ;->۟:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 965
    sget-object v1, Ll/᩸ܰܽ;->֡:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 966
    sget-object v1, Ll/᩸ܰܽ;->᩸:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 967
    sget-object v1, Ll/᩸ܰܽ;->ᩴ:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 970
    sget-object v1, Ll/᩸ܰܽ;->᩺:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 971
    sget-object v1, Ll/᩸ܰܽ;->֨:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 972
    sget-object v1, Ll/᩸ܰܽ;->ۢ:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 973
    sget-object v1, Ll/᩸ܰܽ;->ۡ:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 974
    sget-object v1, Ll/᩸ܰܽ;->ܽ:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 975
    sget-object v1, Ll/᩸ܰܽ;->ۘ:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 976
    sget-object v1, Ll/᩸ܰܽ;->᩵:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 977
    sget-object v1, Ll/᩸ܰܽ;->ܳ:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 978
    sget-object v1, Ll/ܿۛܽ;->ۤ:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 979
    sget-object v1, Ll/᩸ܰܽ;->ۧ:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 980
    invoke-static {}, Ll/᩸ܰܽ;->ۙ()Ll/ܶۨܽ;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 982
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 984
    :cond_5
    sget-object v1, Ll/ۨܰܽ;->ۤ:Ljava/util/List;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 985
    sget-object v1, Ll/ۨۛܽ;->ۤ:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 986
    sget-object v1, Ll/᩸ܰܽ;->ܺ:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 989
    new-instance v1, Ll/᩺ۛܽ;

    invoke-direct {v1, v2}, Ll/᩺ۛܽ;-><init>(Ll/᩺ۨܽ;)V

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 990
    new-instance v1, Ll/᩹᩺ܽ;

    invoke-direct {v1, v2}, Ll/᩹᩺ܽ;-><init>(Ll/᩺ۨܽ;)V

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 991
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 992
    sget-object v1, Ll/᩸ܰܽ;->᩹:Ll/ܶۨܽ;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 993
    new-instance v8, Ll/֨᩺ܽ;

    iget-object v3, v0, Ll/ۘ᩵ܽ;->ᩴ:Ll/᩵᩵ܽ;

    iget-object v4, v0, Ll/ۘ᩵ܽ;->ۤ:Ll/ܰۨܽ;

    iget-object v0, v0, Ll/ۘ᩵ܽ;->ܺ:Ljava/util/ArrayDeque;

    .line 999
    invoke-static {v0}, Ll/ۘ᩵ܽ;->ۙ(Ljava/util/AbstractCollection;)Ljava/util/List;

    move-result-object v6

    move-object v1, v8

    invoke-direct/range {v1 .. v6}, Ll/֨᩺ܽ;-><init>(Ll/᩺ۨܽ;Ll/᩵᩵ܽ;Ll/ܰۨܽ;Ll/֫᩺ܽ;Ljava/util/List;)V

    .line 993
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1001
    invoke-virtual {v7}, Ljava/util/ArrayList;->trimToSize()V

    .line 1002
    invoke-static {v7}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 126
    sput-object v0, Ll/ۘ᩵ܽ;->ۘ:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    sget-object v0, Ll/ܰۨܽ;->ܿ:Ll/ܰۨܽ;

    iput-object v0, p0, Ll/ۘ᩵ܽ;->ۤ:Ll/ܰۨܽ;

    .line 130
    sget-object v0, Ll/᩷ۨܽ;->᩶:Ll/᩷ۨܽ;

    iput-object v0, p0, Ll/ۘ᩵ܽ;->֫:Ll/᩷ۨܽ;

    .line 131
    sget-object v0, Ll/ۘ᩵ܽ;->ۗ:Ll/ۗ᩵ܽ;

    iput-object v0, p0, Ll/ۘ᩵ܽ;->ᩴ:Ll/᩵᩵ܽ;

    .line 132
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۘ᩵ܽ;->ۚ:Ljava/util/HashMap;

    .line 133
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۘ᩵ܽ;->᩸:Ljava/util/ArrayList;

    .line 136
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۘ᩵ܽ;->۫:Ljava/util/ArrayList;

    const/4 v0, 0x2

    .line 140
    iput v0, p0, Ll/ۘ᩵ܽ;->ۙ:I

    .line 141
    iput v0, p0, Ll/ۘ᩵ܽ;->ܽ:I

    const/4 v0, 0x1

    .line 144
    iput-boolean v0, p0, Ll/ۘ᩵ܽ;->᩷:Z

    .line 145
    sget-object v0, Ll/ۘ᩵ܽ;->᩵:Ll/ۨ᩵ܽ;

    iput-object v0, p0, Ll/ۘ᩵ܽ;->ܳ:Ll/ۨ᩵ܽ;

    .line 149
    sget-object v0, Ll/ۘ᩵ܽ;->᩺:Ll/ۧۨܽ;

    iput-object v0, p0, Ll/ۘ᩵ܽ;->᩻:Ll/᩻ۨܽ;

    .line 150
    sget-object v0, Ll/ۘ᩵ܽ;->ۛ:Ll/ۧۨܽ;

    iput-object v0, p0, Ll/ۘ᩵ܽ;->ۧ:Ll/᩻ۨܽ;

    .line 151
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/ۘ᩵ܽ;->ܺ:Ljava/util/ArrayDeque;

    return-void
.end method

.method public static ۙ(Ljava/util/AbstractCollection;)Ljava/util/List;
    .locals 2

    .line 1006
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1007
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0

    .line 1009
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 1011
    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 1012
    check-cast p0, Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    .line 1013
    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    .line 1010
    :goto_0
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 1016
    :cond_2
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
