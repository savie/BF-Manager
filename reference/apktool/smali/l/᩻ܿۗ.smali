.class public final Ll/᩻ܿۗ;
.super Ljava/lang/Object;
.source "H6H3"

# interfaces
.implements Ll/ۚܿۗ;


# instance fields
.field public ۙ:Ljava/lang/Boolean;

.field public ۤ:Ll/֡ۨᩴ;

.field public ۫:Ljava/util/List;

.field public ܳ:Ll/ۤ۟ۗ;

.field public ᩴ:Ll/۟ۨᩴ;

.field public ᩷:Ljava/lang/String;

.field public final ᩸:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩻ܿۗ;->۫:Ljava/util/List;

    .line 134
    sget-object v0, Ll/ۧܿۗ;->֡:Ll/ۧܿۗ;

    .line 135
    const-class v0, Ll/֫ܿۗ;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    const-string v0, "dex-input.verify-checksum"

    .line 142
    iput-object v0, p0, Ll/᩻ܿۗ;->᩸:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩻ܿۗ;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻ܿۗ;->ۙ:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/᩻ܿۗ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻ܿۗ;->᩸:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final name()Ljava/lang/String;
    .locals 1

    .line 147
    iget-object v0, p0, Ll/᩻ܿۗ;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final values()Ljava/util/List;
    .locals 2

    .line 157
    iget-object v0, p0, Ll/᩻ܿۗ;->۫:Ljava/util/List;

    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    iget-object v1, p0, Ll/᩻ܿۗ;->ۤ:Ll/֡ۨᩴ;

    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v0

    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final ۙ()Ljava/lang/String;
    .locals 1

    .line 152
    iget-object v0, p0, Ll/᩻ܿۗ;->᩷:Ljava/lang/String;

    return-object v0
.end method

.method public final ۙ()Ll/᩻ܿۗ;
    .locals 1

    const-string v0, "verify dex file checksum before load"

    .line 177
    iput-object v0, p0, Ll/᩻ܿۗ;->᩷:Ljava/lang/String;

    return-object p0
.end method

.method public final ۙ(Ljava/util/List;)Ll/᩻ܿۗ;
    .locals 0

    .line 219
    iput-object p1, p0, Ll/᩻ܿۗ;->۫:Ljava/util/List;

    return-object p0
.end method

.method public final ۙ(Ll/֡ۨᩴ;)Ll/᩻ܿۗ;
    .locals 0

    .line 195
    iput-object p1, p0, Ll/᩻ܿۗ;->ۤ:Ll/֡ۨᩴ;

    return-object p0
.end method

.method public final ۙ(Ll/۟ۨᩴ;)Ll/᩻ܿۗ;
    .locals 0

    .line 189
    iput-object p1, p0, Ll/᩻ܿۗ;->ᩴ:Ll/۟ۨᩴ;

    return-object p0
.end method

.method public final ۙ(Ll/ۤ۟ۗ;)Ll/᩻ܿۗ;
    .locals 0

    .line 201
    iput-object p1, p0, Ll/᩻ܿۗ;->ܳ:Ll/ۤ۟ۗ;

    return-object p0
.end method

.method public final ۤ()Ljava/util/function/Function;
    .locals 1

    .line 224
    iget-object v0, p0, Ll/᩻ܿۗ;->ᩴ:Ll/۟ۨᩴ;

    return-object v0
.end method

.method public final ᩴ()V
    .locals 3

    .line 236
    iget-object v0, p0, Ll/᩻ܿۗ;->᩷:Ljava/lang/String;

    iget-object v1, p0, Ll/᩻ܿۗ;->᩸:Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 239
    iget-object v0, p0, Ll/᩻ܿۗ;->ᩴ:Ll/۟ۨᩴ;

    if-eqz v0, :cond_2

    .line 242
    iget-object v0, p0, Ll/᩻ܿۗ;->ۤ:Ll/֡ۨᩴ;

    if-eqz v0, :cond_1

    .line 245
    iget-object v0, p0, Ll/᩻ܿۗ;->ܳ:Ll/ۤ۟ۗ;

    if-eqz v0, :cond_0

    return-void

    .line 246
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Setter should be set for option: "

    .line 0
    invoke-static {v2, v1}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 246
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 243
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Formatter should be set for option: "

    .line 0
    invoke-static {v2, v1}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 243
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 240
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Parser should be set for option: "

    .line 0
    invoke-static {v2, v1}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 240
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 237
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Description should be set for option: "

    .line 0
    invoke-static {v2, v1}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 237
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩷()Ll/᩻ܿۗ;
    .locals 1

    .line 2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 183
    iput-object v0, p0, Ll/᩻ܿۗ;->ۙ:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final ᩸()Ljava/util/function/Consumer;
    .locals 1

    .line 232
    iget-object v0, p0, Ll/᩻ܿۗ;->ܳ:Ll/ۤ۟ۗ;

    return-object v0
.end method
