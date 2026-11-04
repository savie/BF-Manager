.class public final Ll/ۧۧᩴ;
.super Ljava/lang/Object;
.source "A4TV"


# instance fields
.field public ۙ:Ljava/lang/Integer;

.field public final ۤ:I

.field public final ᩷:Ljava/util/TreeMap;

.field public final ᩸:Ll/ܿܶۤ;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Ll/ۧۧᩴ;->᩷:Ljava/util/TreeMap;

    const-string v0, "regex"

    .line 78
    invoke-static {p1, v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Ll/ܿܶۤ;->ۙ(Ljava/lang/String;)Ll/ܿܶۤ;

    move-result-object p1

    iput-object p1, p0, Ll/ۧۧᩴ;->᩸:Ll/ܿܶۤ;

    const-string v0, ""

    .line 79
    invoke-virtual {p1, v0}, Ll/ܿܶۤ;->matcher(Ljava/lang/CharSequence;)Ll/ۘܶۤ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۘܶۤ;->groupCount()I

    move-result p1

    iput p1, p0, Ll/ۧۧᩴ;->ۤ:I

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ۧۧᩴ;)Ljava/lang/Integer;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧۧᩴ;->ۙ:Ljava/lang/Integer;

    return-object p0
.end method

.method public static bridge synthetic ۤ(Ll/ۧۧᩴ;)Ll/ܿܶۤ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧۧᩴ;->᩸:Ll/ܿܶۤ;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ۧۧᩴ;)Ljava/util/TreeMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧۧᩴ;->᩷:Ljava/util/TreeMap;

    return-object p0
.end method


# virtual methods
.method public final ۙ()Ll/ܺۧᩴ;
    .locals 1

    .line 104
    new-instance v0, Ll/ܺۧᩴ;

    invoke-direct {v0, p0}, Ll/ܺۧᩴ;-><init>(Ll/ۧۧᩴ;)V

    return-object v0
.end method

.method public final ۙ(I)V
    .locals 1

    const v0, 0x161616

    if-eq p1, v0, :cond_0

    .line 98
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/ۧۧᩴ;->ۙ:Ljava/lang/Integer;

    return-void

    .line 110
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Color is reserved for style inheritance"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩷(I)V
    .locals 2

    .line 87
    iget v0, p0, Ll/ۧۧᩴ;->ۤ:I

    const/4 v1, 0x1

    if-gt v1, v0, :cond_1

    const v0, 0x161616

    if-eq p1, v0, :cond_0

    .line 91
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v1, p0, Ll/ۧۧᩴ;->᩷:Ljava/util/TreeMap;

    invoke-virtual {v1, v0, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 110
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Color is reserved for style inheritance"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 88
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Capture group out of range: 1"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
