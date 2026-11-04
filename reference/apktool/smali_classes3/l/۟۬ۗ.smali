.class public final Ll/۟۬ۗ;
.super Ljava/lang/Object;
.source "Z6FM"


# instance fields
.field public final ۙ:Ljava/util/HashSet;

.field public final ᩷:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/HashSet;)V
    .locals 0

    .line 261
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 262
    iput-object p1, p0, Ll/۟۬ۗ;->᩷:Ljava/util/ArrayList;

    .line 263
    iput-object p2, p0, Ll/۟۬ۗ;->ۙ:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final ۙ()Ljava/util/Set;
    .locals 1

    .line 271
    iget-object v0, p0, Ll/۟۬ۗ;->ۙ:Ljava/util/HashSet;

    return-object v0
.end method

.method public final ᩷()Ljava/util/List;
    .locals 1

    .line 267
    iget-object v0, p0, Ll/۟۬ۗ;->᩷:Ljava/util/ArrayList;

    return-object v0
.end method
