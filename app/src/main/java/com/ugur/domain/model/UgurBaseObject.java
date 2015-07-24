/*
* Copyright (C) 2015 Pedro Paulo de Amorim.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.ugur.domain.model;

import java.util.HashMap;

public class UgurBaseObject {

  private int upVotes = Integer.MIN_VALUE;
  private int downVotes = Integer.MIN_VALUE;
  private int views;
  private int score;
  private String id;
  private String title;
  private String description;
  private String account;
  private String accountId;
  private String link;
  private String gifVLink;
  private String mp4Link;
  private String redditLink;
  private String vote;
  private String deleteHash;
  private String topic;
  private long date;
  private long bandwidth;
  private boolean isFavorited;
  private boolean isNSFW = false;

  private HashMap<Integer, String> mTags;

  public UgurBaseObject(String id, String title, String link) {
    this.id = id;
    this.title = title;
    this.link = link;
  }

  public int getUpVotes() {
    return upVotes;
  }

  public void setUpVotes(int upVotes) {
    this.upVotes = upVotes;
  }

  public int getDownVotes() {
    return downVotes;
  }

  public void setDownVotes(int downVotes) {
    this.downVotes = downVotes;
  }

  public int getViews() {
    return views;
  }

  public void setViews(int views) {
    this.views = views;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public String getGifVLink() {
    return gifVLink;
  }

  public void setGifVLink(String gifVLink) {
    this.gifVLink = gifVLink;
  }

  public String getMp4Link() {
    return mp4Link;
  }

  public void setMp4Link(String mp4Link) {
    this.mp4Link = mp4Link;
  }

  public String getRedditLink() {
    return redditLink;
  }

  public void setRedditLink(String redditLink) {
    this.redditLink = redditLink;
  }

  public String getVote() {
    return vote;
  }

  public void setVote(String vote) {
    this.vote = vote;
  }

  public String getDeleteHash() {
    return deleteHash;
  }

  public void setDeleteHash(String deleteHash) {
    this.deleteHash = deleteHash;
  }

  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public long getDate() {
    return date;
  }

  public void setDate(long date) {
    this.date = date;
  }

  public long getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(long bandwidth) {
    this.bandwidth = bandwidth;
  }

  public boolean isFavorited() {
    return isFavorited;
  }

  public void setIsFavorited(boolean isFavorited) {
    this.isFavorited = isFavorited;
  }

  public boolean isNSFW() {
    return isNSFW;
  }

  public void setIsNSFW(boolean isNSFW) {
    this.isNSFW = isNSFW;
  }

  public HashMap<Integer, String> getmTags() {
    return mTags;
  }

  public void setmTags(HashMap<Integer, String> mTags) {
    this.mTags = mTags;
  }

}
